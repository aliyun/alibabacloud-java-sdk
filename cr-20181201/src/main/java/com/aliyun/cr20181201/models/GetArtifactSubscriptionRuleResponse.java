// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactSubscriptionRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetArtifactSubscriptionRuleResponseBody body;

    public static GetArtifactSubscriptionRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactSubscriptionRuleResponse self = new GetArtifactSubscriptionRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetArtifactSubscriptionRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArtifactSubscriptionRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetArtifactSubscriptionRuleResponse setBody(GetArtifactSubscriptionRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArtifactSubscriptionRuleResponseBody getBody() {
        return this.body;
    }

}
