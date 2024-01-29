// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRepositoriesResponseBody body;

    public static ListRepositoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoriesResponse self = new ListRepositoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListRepositoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepositoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepositoriesResponse setBody(ListRepositoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoriesResponseBody getBody() {
        return this.body;
    }

}
