// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRepositoryResponseBody body;

    public static CreateRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRepositoryResponse self = new CreateRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRepositoryResponse setBody(CreateRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepositoryResponseBody getBody() {
        return this.body;
    }

}
