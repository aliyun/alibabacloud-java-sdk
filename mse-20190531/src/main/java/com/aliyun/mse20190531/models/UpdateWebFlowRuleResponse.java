// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateWebFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWebFlowRuleResponseBody body;

    public static UpdateWebFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebFlowRuleResponse self = new UpdateWebFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWebFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWebFlowRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWebFlowRuleResponse setBody(UpdateWebFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWebFlowRuleResponseBody getBody() {
        return this.body;
    }

}
