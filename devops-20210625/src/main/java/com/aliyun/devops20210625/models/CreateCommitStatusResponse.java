// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateCommitStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCommitStatusResponseBody body;

    public static CreateCommitStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCommitStatusResponse self = new CreateCommitStatusResponse();
        return TeaModel.build(map, self);
    }

    public CreateCommitStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCommitStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCommitStatusResponse setBody(CreateCommitStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCommitStatusResponseBody getBody() {
        return this.body;
    }

}
