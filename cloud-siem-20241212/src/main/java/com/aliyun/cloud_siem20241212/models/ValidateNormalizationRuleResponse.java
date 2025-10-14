// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ValidateNormalizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateNormalizationRuleResponseBody body;

    public static ValidateNormalizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateNormalizationRuleResponse self = new ValidateNormalizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public ValidateNormalizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateNormalizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateNormalizationRuleResponse setBody(ValidateNormalizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateNormalizationRuleResponseBody getBody() {
        return this.body;
    }

}
