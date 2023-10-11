// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateOrgHonorTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrgHonorTemplateResponseBody body;

    public static CreateOrgHonorTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrgHonorTemplateResponse self = new CreateOrgHonorTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrgHonorTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrgHonorTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrgHonorTemplateResponse setBody(CreateOrgHonorTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrgHonorTemplateResponseBody getBody() {
        return this.body;
    }

}
