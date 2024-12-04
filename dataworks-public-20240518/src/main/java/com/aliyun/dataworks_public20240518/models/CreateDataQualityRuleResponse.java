// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataQualityRuleResponseBody body;

    public static CreateDataQualityRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityRuleResponse self = new CreateDataQualityRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataQualityRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataQualityRuleResponse setBody(CreateDataQualityRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataQualityRuleResponseBody getBody() {
        return this.body;
    }

}
