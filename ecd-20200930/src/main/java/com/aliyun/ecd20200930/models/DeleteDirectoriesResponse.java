// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDirectoriesResponseBody body;

    public static DeleteDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDirectoriesResponse self = new DeleteDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDirectoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDirectoriesResponse setBody(DeleteDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDirectoriesResponseBody getBody() {
        return this.body;
    }

}
