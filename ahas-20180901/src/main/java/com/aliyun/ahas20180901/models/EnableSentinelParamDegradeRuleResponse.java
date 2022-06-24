// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class EnableSentinelParamDegradeRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableSentinelParamDegradeRuleResponseBody body;

    public static EnableSentinelParamDegradeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSentinelParamDegradeRuleResponse self = new EnableSentinelParamDegradeRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableSentinelParamDegradeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSentinelParamDegradeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSentinelParamDegradeRuleResponse setBody(EnableSentinelParamDegradeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSentinelParamDegradeRuleResponseBody getBody() {
        return this.body;
    }

}
