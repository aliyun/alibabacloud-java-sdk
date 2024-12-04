// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataQualityRuleResponseBody body;

    public static UpdateDataQualityRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityRuleResponse self = new UpdateDataQualityRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataQualityRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataQualityRuleResponse setBody(UpdateDataQualityRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataQualityRuleResponseBody getBody() {
        return this.body;
    }

}
