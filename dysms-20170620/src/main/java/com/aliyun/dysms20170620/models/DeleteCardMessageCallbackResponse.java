// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeleteCardMessageCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCardMessageCallbackResponseBody body;

    public static DeleteCardMessageCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCardMessageCallbackResponse self = new DeleteCardMessageCallbackResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCardMessageCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCardMessageCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCardMessageCallbackResponse setBody(DeleteCardMessageCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCardMessageCallbackResponseBody getBody() {
        return this.body;
    }

}
