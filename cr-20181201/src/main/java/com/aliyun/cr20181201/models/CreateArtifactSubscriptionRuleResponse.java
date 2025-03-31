// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateArtifactSubscriptionRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateArtifactSubscriptionRuleResponseBody body;

    public static CreateArtifactSubscriptionRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactSubscriptionRuleResponse self = new CreateArtifactSubscriptionRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateArtifactSubscriptionRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateArtifactSubscriptionRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateArtifactSubscriptionRuleResponse setBody(CreateArtifactSubscriptionRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateArtifactSubscriptionRuleResponseBody getBody() {
        return this.body;
    }

}
