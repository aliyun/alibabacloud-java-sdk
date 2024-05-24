// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class GetPipelineTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PipelineTemplate body;

    public static GetPipelineTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineTemplateResponse self = new GetPipelineTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPipelineTemplateResponse setBody(PipelineTemplate body) {
        this.body = body;
        return this;
    }
    public PipelineTemplate getBody() {
        return this.body;
    }

}
