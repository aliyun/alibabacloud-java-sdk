// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateFlowProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFlowProjectResponseBody body;

    public static CreateFlowProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowProjectResponse self = new CreateFlowProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFlowProjectResponse setBody(CreateFlowProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowProjectResponseBody getBody() {
        return this.body;
    }

}
