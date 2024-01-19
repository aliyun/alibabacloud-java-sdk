// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateProjectLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProjectLabelResponseBody body;

    public static CreateProjectLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectLabelResponse self = new CreateProjectLabelResponse();
        return TeaModel.build(map, self);
    }

    public CreateProjectLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProjectLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProjectLabelResponse setBody(CreateProjectLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProjectLabelResponseBody getBody() {
        return this.body;
    }

}
