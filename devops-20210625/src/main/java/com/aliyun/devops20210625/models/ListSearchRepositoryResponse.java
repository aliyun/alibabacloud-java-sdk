// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListSearchRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSearchRepositoryResponseBody body;

    public static ListSearchRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSearchRepositoryResponse self = new ListSearchRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public ListSearchRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSearchRepositoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSearchRepositoryResponse setBody(ListSearchRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSearchRepositoryResponseBody getBody() {
        return this.body;
    }

}
