// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunContractRuleGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunContractRuleGenerationResponseBody body;

    public static RunContractRuleGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunContractRuleGenerationResponse self = new RunContractRuleGenerationResponse();
        return TeaModel.build(map, self);
    }

    public RunContractRuleGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunContractRuleGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunContractRuleGenerationResponse setBody(RunContractRuleGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunContractRuleGenerationResponseBody getBody() {
        return this.body;
    }

}
