// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreatePipelineFromTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePipelineFromTemplateResponseBody body;

    public static CreatePipelineFromTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineFromTemplateResponse self = new CreatePipelineFromTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreatePipelineFromTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePipelineFromTemplateResponse setBody(CreatePipelineFromTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePipelineFromTemplateResponseBody getBody() {
        return this.body;
    }

}
