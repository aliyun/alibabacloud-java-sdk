// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class NotifyMessageRepeaterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public NotifyMessageRepeaterResponseBody body;

    public static NotifyMessageRepeaterResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyMessageRepeaterResponse self = new NotifyMessageRepeaterResponse();
        return TeaModel.build(map, self);
    }

    public NotifyMessageRepeaterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NotifyMessageRepeaterResponse setBody(NotifyMessageRepeaterResponseBody body) {
        this.body = body;
        return this;
    }
    public NotifyMessageRepeaterResponseBody getBody() {
        return this.body;
    }

}
