// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAppListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAppListResponseBody body;

    public static DeleteAppListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppListResponse self = new DeleteAppListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppListResponse setBody(DeleteAppListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppListResponseBody getBody() {
        return this.body;
    }

}
