// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRepositoryResponseBody body;

    public static ListRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryResponse self = new ListRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public ListRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepositoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepositoryResponse setBody(ListRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryResponseBody getBody() {
        return this.body;
    }

}
