// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataQualityAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataQualityAlertRuleResponseBody body;

    public static DeleteDataQualityAlertRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataQualityAlertRuleResponse self = new DeleteDataQualityAlertRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataQualityAlertRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataQualityAlertRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataQualityAlertRuleResponse setBody(DeleteDataQualityAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataQualityAlertRuleResponseBody getBody() {
        return this.body;
    }

}
