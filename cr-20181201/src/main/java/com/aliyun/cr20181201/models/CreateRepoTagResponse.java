// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRepoTagResponseBody body;

    public static CreateRepoTagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoTagResponse self = new CreateRepoTagResponse();
        return TeaModel.build(map, self);
    }

    public CreateRepoTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRepoTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRepoTagResponse setBody(CreateRepoTagResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepoTagResponseBody getBody() {
        return this.body;
    }

}
