// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataQualityAlertRuleResponseBody body;

    public static UpdateDataQualityAlertRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityAlertRuleResponse self = new UpdateDataQualityAlertRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityAlertRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataQualityAlertRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataQualityAlertRuleResponse setBody(UpdateDataQualityAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataQualityAlertRuleResponseBody getBody() {
        return this.body;
    }

}
