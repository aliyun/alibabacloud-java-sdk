// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateImageBuildResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImageBuildResponseBody body;

    public static CreateImageBuildResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageBuildResponse self = new CreateImageBuildResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageBuildResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageBuildResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImageBuildResponse setBody(CreateImageBuildResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageBuildResponseBody getBody() {
        return this.body;
    }

}
