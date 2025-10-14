// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetNormalizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNormalizationRuleResponseBody body;

    public static GetNormalizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNormalizationRuleResponse self = new GetNormalizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetNormalizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNormalizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNormalizationRuleResponse setBody(GetNormalizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNormalizationRuleResponseBody getBody() {
        return this.body;
    }

}
