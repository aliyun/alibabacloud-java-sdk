// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateEditingProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEditingProjectResponseBody body;

    public static CreateEditingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEditingProjectResponse self = new CreateEditingProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateEditingProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEditingProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEditingProjectResponse setBody(CreateEditingProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEditingProjectResponseBody getBody() {
        return this.body;
    }

}
