// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class GetClientRuleStrategyDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClientRuleStrategyDetailResponseBody body;

    public static GetClientRuleStrategyDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClientRuleStrategyDetailResponse self = new GetClientRuleStrategyDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetClientRuleStrategyDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClientRuleStrategyDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClientRuleStrategyDetailResponse setBody(GetClientRuleStrategyDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClientRuleStrategyDetailResponseBody getBody() {
        return this.body;
    }

}
