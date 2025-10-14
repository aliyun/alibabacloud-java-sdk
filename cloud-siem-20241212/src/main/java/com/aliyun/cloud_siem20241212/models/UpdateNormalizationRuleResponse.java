// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateNormalizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNormalizationRuleResponseBody body;

    public static UpdateNormalizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNormalizationRuleResponse self = new UpdateNormalizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNormalizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNormalizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNormalizationRuleResponse setBody(UpdateNormalizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNormalizationRuleResponseBody getBody() {
        return this.body;
    }

}
