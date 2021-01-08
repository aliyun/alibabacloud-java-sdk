// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreateDevopsProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDevopsProjectResponseBody body;

    public static CreateDevopsProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDevopsProjectResponse self = new CreateDevopsProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateDevopsProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDevopsProjectResponse setBody(CreateDevopsProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDevopsProjectResponseBody getBody() {
        return this.body;
    }

}
