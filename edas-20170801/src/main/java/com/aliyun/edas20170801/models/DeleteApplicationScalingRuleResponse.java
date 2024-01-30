// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteApplicationScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApplicationScalingRuleResponseBody body;

    public static DeleteApplicationScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationScalingRuleResponse self = new DeleteApplicationScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplicationScalingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApplicationScalingRuleResponse setBody(DeleteApplicationScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplicationScalingRuleResponseBody getBody() {
        return this.body;
    }

}
