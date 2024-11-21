// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAlertRuleResponseBody body;

    public static CreateAlertRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertRuleResponse self = new CreateAlertRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlertRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlertRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAlertRuleResponse setBody(CreateAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlertRuleResponseBody getBody() {
        return this.body;
    }

}
