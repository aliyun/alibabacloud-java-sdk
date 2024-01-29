// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateSprintResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateSprintResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSprintResponse setBody(CreateSprintResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSprintResponseBody getBody() {
        return this.body;
    }

}
