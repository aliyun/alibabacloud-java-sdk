// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetRepositoryTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRepositoryTagResponseBody body;

    public static GetRepositoryTagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryTagResponse self = new GetRepositoryTagResponse();
        return TeaModel.build(map, self);
    }

    public GetRepositoryTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepositoryTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRepositoryTagResponse setBody(GetRepositoryTagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepositoryTagResponseBody getBody() {
        return this.body;
    }

}
