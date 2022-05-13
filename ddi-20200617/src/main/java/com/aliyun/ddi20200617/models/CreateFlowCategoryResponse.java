// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateFlowCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFlowCategoryResponseBody body;

    public static CreateFlowCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowCategoryResponse self = new CreateFlowCategoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFlowCategoryResponse setBody(CreateFlowCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowCategoryResponseBody getBody() {
        return this.body;
    }

}
