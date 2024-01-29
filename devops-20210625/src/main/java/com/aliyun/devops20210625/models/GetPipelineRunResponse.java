// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPipelineRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPipelineRunResponseBody body;

    public static GetPipelineRunResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineRunResponse self = new GetPipelineRunResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPipelineRunResponse setBody(GetPipelineRunResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipelineRunResponseBody getBody() {
        return this.body;
    }

}
