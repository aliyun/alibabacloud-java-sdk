// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteNormalizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNormalizationRuleResponseBody body;

    public static DeleteNormalizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNormalizationRuleResponse self = new DeleteNormalizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNormalizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNormalizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNormalizationRuleResponse setBody(DeleteNormalizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNormalizationRuleResponseBody getBody() {
        return this.body;
    }

}
