// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSourceCodeRepoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRepoSourceCodeRepoResponseBody body;

    public static CreateRepoSourceCodeRepoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoSourceCodeRepoResponse self = new CreateRepoSourceCodeRepoResponse();
        return TeaModel.build(map, self);
    }

    public CreateRepoSourceCodeRepoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRepoSourceCodeRepoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRepoSourceCodeRepoResponse setBody(CreateRepoSourceCodeRepoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepoSourceCodeRepoResponseBody getBody() {
        return this.body;
    }

}
