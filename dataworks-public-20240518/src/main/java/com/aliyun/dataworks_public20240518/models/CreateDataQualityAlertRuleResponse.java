// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataQualityAlertRuleResponseBody body;

    public static CreateDataQualityAlertRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityAlertRuleResponse self = new CreateDataQualityAlertRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityAlertRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataQualityAlertRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataQualityAlertRuleResponse setBody(CreateDataQualityAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataQualityAlertRuleResponseBody getBody() {
        return this.body;
    }

}
