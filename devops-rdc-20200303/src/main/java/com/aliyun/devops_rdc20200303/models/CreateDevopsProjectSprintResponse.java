// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreateDevopsProjectSprintResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDevopsProjectSprintResponseBody body;

    public static CreateDevopsProjectSprintResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDevopsProjectSprintResponse self = new CreateDevopsProjectSprintResponse();
        return TeaModel.build(map, self);
    }

    public CreateDevopsProjectSprintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDevopsProjectSprintResponse setBody(CreateDevopsProjectSprintResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDevopsProjectSprintResponseBody getBody() {
        return this.body;
    }

}
