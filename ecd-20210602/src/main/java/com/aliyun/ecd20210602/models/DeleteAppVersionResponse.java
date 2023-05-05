// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DeleteAppVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
