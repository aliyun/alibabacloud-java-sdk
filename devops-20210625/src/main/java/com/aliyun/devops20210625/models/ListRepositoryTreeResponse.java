// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryTreeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRepositoryTreeResponseBody body;

    public static ListRepositoryTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryTreeResponse self = new ListRepositoryTreeResponse();
        return TeaModel.build(map, self);
    }

    public ListRepositoryTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepositoryTreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepositoryTreeResponse setBody(ListRepositoryTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryTreeResponseBody getBody() {
        return this.body;
    }

}
