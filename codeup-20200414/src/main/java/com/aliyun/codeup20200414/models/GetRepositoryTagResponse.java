// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetRepositoryTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
