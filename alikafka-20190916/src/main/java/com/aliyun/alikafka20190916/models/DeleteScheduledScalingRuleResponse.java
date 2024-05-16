// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteScheduledScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteScheduledScalingRuleResponseBody body;

    public static DeleteScheduledScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduledScalingRuleResponse self = new DeleteScheduledScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScheduledScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScheduledScalingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScheduledScalingRuleResponse setBody(DeleteScheduledScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScheduledScalingRuleResponseBody getBody() {
        return this.body;
    }

}
