// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class SendBizCocChangeCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendBizCocChangeCallbackResponseBody body;

    public static SendBizCocChangeCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        SendBizCocChangeCallbackResponse self = new SendBizCocChangeCallbackResponse();
        return TeaModel.build(map, self);
    }

    public SendBizCocChangeCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendBizCocChangeCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendBizCocChangeCallbackResponse setBody(SendBizCocChangeCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public SendBizCocChangeCallbackResponseBody getBody() {
        return this.body;
    }

}
