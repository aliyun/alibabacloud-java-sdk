// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteHttpApiOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHttpApiOperationResponseBody body;

    public static DeleteHttpApiOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpApiOperationResponse self = new DeleteHttpApiOperationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHttpApiOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHttpApiOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHttpApiOperationResponse setBody(DeleteHttpApiOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHttpApiOperationResponseBody getBody() {
        return this.body;
    }

}
