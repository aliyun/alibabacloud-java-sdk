// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateWebFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWebFlowRuleResponseBody body;

    public static CreateWebFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWebFlowRuleResponse self = new CreateWebFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateWebFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWebFlowRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWebFlowRuleResponse setBody(CreateWebFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWebFlowRuleResponseBody getBody() {
        return this.body;
    }

}
