// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class SendCommonMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendCommonMessageResponseBody body;

    public static SendCommonMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCommonMessageResponse self = new SendCommonMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendCommonMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendCommonMessageResponse setBody(SendCommonMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCommonMessageResponseBody getBody() {
        return this.body;
    }

}
