// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class NotifyUserBusinessCommandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public NotifyUserBusinessCommandResponseBody body;

    public static NotifyUserBusinessCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyUserBusinessCommandResponse self = new NotifyUserBusinessCommandResponse();
        return TeaModel.build(map, self);
    }

    public NotifyUserBusinessCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NotifyUserBusinessCommandResponse setBody(NotifyUserBusinessCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public NotifyUserBusinessCommandResponseBody getBody() {
        return this.body;
    }

}
