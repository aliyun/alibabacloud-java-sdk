// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRepositoryResponseBody body;

    public static GetRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryResponse self = new GetRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public GetRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepositoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRepositoryResponse setBody(GetRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepositoryResponseBody getBody() {
        return this.body;
    }

}
