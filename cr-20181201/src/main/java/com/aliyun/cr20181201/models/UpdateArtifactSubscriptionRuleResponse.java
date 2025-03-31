// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateArtifactSubscriptionRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateArtifactSubscriptionRuleResponseBody body;

    public static UpdateArtifactSubscriptionRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateArtifactSubscriptionRuleResponse self = new UpdateArtifactSubscriptionRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateArtifactSubscriptionRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateArtifactSubscriptionRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateArtifactSubscriptionRuleResponse setBody(UpdateArtifactSubscriptionRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateArtifactSubscriptionRuleResponseBody getBody() {
        return this.body;
    }

}
