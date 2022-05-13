// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteSeataServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSeataServerResponseBody body;

    public static DeleteSeataServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSeataServerResponse self = new DeleteSeataServerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSeataServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSeataServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSeataServerResponse setBody(DeleteSeataServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSeataServerResponseBody getBody() {
        return this.body;
    }

}
