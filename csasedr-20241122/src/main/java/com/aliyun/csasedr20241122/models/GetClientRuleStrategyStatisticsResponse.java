// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class GetClientRuleStrategyStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClientRuleStrategyStatisticsResponseBody body;

    public static GetClientRuleStrategyStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClientRuleStrategyStatisticsResponse self = new GetClientRuleStrategyStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetClientRuleStrategyStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClientRuleStrategyStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClientRuleStrategyStatisticsResponse setBody(GetClientRuleStrategyStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClientRuleStrategyStatisticsResponseBody getBody() {
        return this.body;
    }

}
