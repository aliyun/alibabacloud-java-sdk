// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetToolCallDistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetToolCallDistributionResponseBody body;

    public static GetToolCallDistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetToolCallDistributionResponse self = new GetToolCallDistributionResponse();
        return TeaModel.build(map, self);
    }

    public GetToolCallDistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetToolCallDistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetToolCallDistributionResponse setBody(GetToolCallDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetToolCallDistributionResponseBody getBody() {
        return this.body;
    }

}
