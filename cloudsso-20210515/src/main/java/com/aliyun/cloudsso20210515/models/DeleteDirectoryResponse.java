// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDirectoryResponseBody body;

    public static DeleteDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDirectoryResponse self = new DeleteDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDirectoryResponse setBody(DeleteDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDirectoryResponseBody getBody() {
        return this.body;
    }

}
