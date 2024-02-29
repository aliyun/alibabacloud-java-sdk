// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateQualityRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateQualityRuleResponseBody body;

    public static CreateQualityRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityRuleResponse self = new CreateQualityRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateQualityRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQualityRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQualityRuleResponse setBody(CreateQualityRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQualityRuleResponseBody getBody() {
        return this.body;
    }

}
