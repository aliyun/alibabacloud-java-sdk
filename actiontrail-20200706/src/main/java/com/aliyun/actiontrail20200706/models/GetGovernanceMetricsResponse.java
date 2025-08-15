// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetGovernanceMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGovernanceMetricsResponseBody body;

    public static GetGovernanceMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceMetricsResponse self = new GetGovernanceMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetGovernanceMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGovernanceMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGovernanceMetricsResponse setBody(GetGovernanceMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGovernanceMetricsResponseBody getBody() {
        return this.body;
    }

}
