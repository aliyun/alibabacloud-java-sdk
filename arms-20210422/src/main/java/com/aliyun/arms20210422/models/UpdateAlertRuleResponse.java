// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class UpdateAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAlertRuleResponseBody body;

    public static UpdateAlertRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertRuleResponse self = new UpdateAlertRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlertRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlertRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlertRuleResponse setBody(UpdateAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlertRuleResponseBody getBody() {
        return this.body;
    }

}
