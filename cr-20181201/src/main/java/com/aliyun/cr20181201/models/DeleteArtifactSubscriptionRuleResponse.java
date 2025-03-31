// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteArtifactSubscriptionRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteArtifactSubscriptionRuleResponseBody body;

    public static DeleteArtifactSubscriptionRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteArtifactSubscriptionRuleResponse self = new DeleteArtifactSubscriptionRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteArtifactSubscriptionRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteArtifactSubscriptionRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteArtifactSubscriptionRuleResponse setBody(DeleteArtifactSubscriptionRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteArtifactSubscriptionRuleResponseBody getBody() {
        return this.body;
    }

}
