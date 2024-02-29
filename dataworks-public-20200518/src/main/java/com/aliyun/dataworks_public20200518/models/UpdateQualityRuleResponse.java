// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateQualityRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateQualityRuleResponseBody body;

    public static UpdateQualityRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityRuleResponse self = new UpdateQualityRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQualityRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQualityRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateQualityRuleResponse setBody(UpdateQualityRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQualityRuleResponseBody getBody() {
        return this.body;
    }

}
