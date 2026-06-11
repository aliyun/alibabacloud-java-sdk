// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayQuotaRuleSubjectUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayQuotaRuleSubjectUsageResponseBody body;

    public static GetGatewayQuotaRuleSubjectUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayQuotaRuleSubjectUsageResponse self = new GetGatewayQuotaRuleSubjectUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayQuotaRuleSubjectUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayQuotaRuleSubjectUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayQuotaRuleSubjectUsageResponse setBody(GetGatewayQuotaRuleSubjectUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayQuotaRuleSubjectUsageResponseBody getBody() {
        return this.body;
    }

}
