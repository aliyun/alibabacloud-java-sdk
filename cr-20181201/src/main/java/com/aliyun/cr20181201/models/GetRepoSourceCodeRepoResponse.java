// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoSourceCodeRepoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRepoSourceCodeRepoResponseBody body;

    public static GetRepoSourceCodeRepoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepoSourceCodeRepoResponse self = new GetRepoSourceCodeRepoResponse();
        return TeaModel.build(map, self);
    }

    public GetRepoSourceCodeRepoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepoSourceCodeRepoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRepoSourceCodeRepoResponse setBody(GetRepoSourceCodeRepoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepoSourceCodeRepoResponseBody getBody() {
        return this.body;
    }

}
