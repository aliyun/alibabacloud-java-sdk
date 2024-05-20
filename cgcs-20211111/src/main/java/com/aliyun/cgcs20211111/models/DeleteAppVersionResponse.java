// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class DeleteAppVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppVersionResponseBody body;

    public static DeleteAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppVersionResponse self = new DeleteAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppVersionResponse setBody(DeleteAppVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppVersionResponseBody getBody() {
        return this.body;
    }

}
