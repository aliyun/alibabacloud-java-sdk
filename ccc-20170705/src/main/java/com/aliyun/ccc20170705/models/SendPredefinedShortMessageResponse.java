// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class SendPredefinedShortMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendPredefinedShortMessageResponseBody body;

    public static SendPredefinedShortMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendPredefinedShortMessageResponse self = new SendPredefinedShortMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendPredefinedShortMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendPredefinedShortMessageResponse setBody(SendPredefinedShortMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendPredefinedShortMessageResponseBody getBody() {
        return this.body;
    }

}
