// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteLogicalModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLogicalModelResponseBody body;

    public static DeleteLogicalModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogicalModelResponse self = new DeleteLogicalModelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLogicalModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLogicalModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLogicalModelResponse setBody(DeleteLogicalModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLogicalModelResponseBody getBody() {
        return this.body;
    }

}
