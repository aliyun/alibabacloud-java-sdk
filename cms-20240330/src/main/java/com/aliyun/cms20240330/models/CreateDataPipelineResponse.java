// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateDataPipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataPipelineResponseBody body;

    public static CreateDataPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataPipelineResponse self = new CreateDataPipelineResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataPipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataPipelineResponse setBody(CreateDataPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataPipelineResponseBody getBody() {
        return this.body;
    }

}
