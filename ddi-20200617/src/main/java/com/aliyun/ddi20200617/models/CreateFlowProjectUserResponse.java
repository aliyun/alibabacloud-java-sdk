// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateFlowProjectUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFlowProjectUserResponseBody body;

    public static CreateFlowProjectUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowProjectUserResponse self = new CreateFlowProjectUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowProjectUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowProjectUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFlowProjectUserResponse setBody(CreateFlowProjectUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowProjectUserResponseBody getBody() {
        return this.body;
    }

}
