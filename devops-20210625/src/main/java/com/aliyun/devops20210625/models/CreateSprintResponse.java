// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateSprintResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSprintResponseBody body;

    public static CreateSprintResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSprintResponse self = new CreateSprintResponse();
        return TeaModel.build(map, self);
    }

    public CreateSprintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSprintResponse setBody(CreateSprintResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSprintResponseBody getBody() {
        return this.body;
    }

}
