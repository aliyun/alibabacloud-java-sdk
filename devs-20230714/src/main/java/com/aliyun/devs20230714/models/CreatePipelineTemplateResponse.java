// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class CreatePipelineTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PipelineTemplate body;

    public static CreatePipelineTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineTemplateResponse self = new CreatePipelineTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreatePipelineTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePipelineTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePipelineTemplateResponse setBody(PipelineTemplate body) {
        this.body = body;
        return this;
    }
    public PipelineTemplate getBody() {
        return this.body;
    }

}
