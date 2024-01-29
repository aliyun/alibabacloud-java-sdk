// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFlowRuleResponseBody body;

    public static UpdateFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowRuleResponse self = new UpdateFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlowRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFlowRuleResponse setBody(UpdateFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlowRuleResponseBody getBody() {
        return this.body;
    }

}
