// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ModifyProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyProjectResponseBody body;

    public static ModifyProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProjectResponse self = new ModifyProjectResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyProjectResponse setBody(ModifyProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProjectResponseBody getBody() {
        return this.body;
    }

}
