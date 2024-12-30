// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreatePipelineNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePipelineNodeResponseBody body;

    public static CreatePipelineNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineNodeResponse self = new CreatePipelineNodeResponse();
        return TeaModel.build(map, self);
    }

    public CreatePipelineNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePipelineNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePipelineNodeResponse setBody(CreatePipelineNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePipelineNodeResponseBody getBody() {
        return this.body;
    }

}
