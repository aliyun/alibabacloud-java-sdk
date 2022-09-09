// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateProjectBuildResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProjectBuildResponseBody body;

    public static CreateProjectBuildResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectBuildResponse self = new CreateProjectBuildResponse();
        return TeaModel.build(map, self);
    }

    public CreateProjectBuildResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProjectBuildResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProjectBuildResponse setBody(CreateProjectBuildResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProjectBuildResponseBody getBody() {
        return this.body;
    }

}
