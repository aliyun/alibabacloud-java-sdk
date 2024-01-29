// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFlowRuleResponseBody body;

    public static CreateFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowRuleResponse self = new CreateFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFlowRuleResponse setBody(CreateFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowRuleResponseBody getBody() {
        return this.body;
    }

}
