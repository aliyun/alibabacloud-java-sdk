// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentTaskModelUsageMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataAgentTaskModelUsageMetricsResponseBody body;

    public static GetDataAgentTaskModelUsageMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentTaskModelUsageMetricsResponse self = new GetDataAgentTaskModelUsageMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetDataAgentTaskModelUsageMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataAgentTaskModelUsageMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataAgentTaskModelUsageMetricsResponse setBody(GetDataAgentTaskModelUsageMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataAgentTaskModelUsageMetricsResponseBody getBody() {
        return this.body;
    }

}
