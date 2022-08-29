// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateProjectMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProjectMetaResponseBody body;

    public static CreateProjectMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectMetaResponse self = new CreateProjectMetaResponse();
        return TeaModel.build(map, self);
    }

    public CreateProjectMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProjectMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProjectMetaResponse setBody(CreateProjectMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProjectMetaResponseBody getBody() {
        return this.body;
    }

}
