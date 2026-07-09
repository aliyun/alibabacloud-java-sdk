// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetPipelineStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPipelineStatsResponseBody body;

    public static GetPipelineStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineStatsResponse self = new GetPipelineStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPipelineStatsResponse setBody(GetPipelineStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipelineStatsResponseBody getBody() {
        return this.body;
    }

}
