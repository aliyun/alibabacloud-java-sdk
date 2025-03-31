// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListArtifactSubscriptionRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListArtifactSubscriptionRuleResponseBody body;

    public static ListArtifactSubscriptionRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactSubscriptionRuleResponse self = new ListArtifactSubscriptionRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListArtifactSubscriptionRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListArtifactSubscriptionRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListArtifactSubscriptionRuleResponse setBody(ListArtifactSubscriptionRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListArtifactSubscriptionRuleResponseBody getBody() {
        return this.body;
    }

}
