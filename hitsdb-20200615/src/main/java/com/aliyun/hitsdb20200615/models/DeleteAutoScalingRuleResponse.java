// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class DeleteAutoScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAutoScalingRuleResponseBody body;

    public static DeleteAutoScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoScalingRuleResponse self = new DeleteAutoScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAutoScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAutoScalingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAutoScalingRuleResponse setBody(DeleteAutoScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAutoScalingRuleResponseBody getBody() {
        return this.body;
    }

}
