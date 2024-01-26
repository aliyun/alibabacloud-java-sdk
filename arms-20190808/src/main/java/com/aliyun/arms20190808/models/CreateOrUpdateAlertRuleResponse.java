// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOrUpdateAlertRuleResponseBody body;

    public static CreateOrUpdateAlertRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAlertRuleResponse self = new CreateOrUpdateAlertRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAlertRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateAlertRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrUpdateAlertRuleResponse setBody(CreateOrUpdateAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateAlertRuleResponseBody getBody() {
        return this.body;
    }

}
