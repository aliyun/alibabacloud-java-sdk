// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateApplicationScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationScalingRuleResponseBody body;

    public static UpdateApplicationScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationScalingRuleResponse self = new UpdateApplicationScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationScalingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationScalingRuleResponse setBody(UpdateApplicationScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationScalingRuleResponseBody getBody() {
        return this.body;
    }

}
