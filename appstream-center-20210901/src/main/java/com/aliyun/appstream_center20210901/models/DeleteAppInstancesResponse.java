// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteAppInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAppInstancesResponseBody body;

    public static DeleteAppInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppInstancesResponse self = new DeleteAppInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppInstancesResponse setBody(DeleteAppInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppInstancesResponseBody getBody() {
        return this.body;
    }

}
