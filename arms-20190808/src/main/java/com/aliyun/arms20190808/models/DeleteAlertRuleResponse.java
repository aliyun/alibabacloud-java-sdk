// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAlertRuleResponseBody body;

    public static DeleteAlertRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertRuleResponse self = new DeleteAlertRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlertRuleResponse setBody(DeleteAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertRuleResponseBody getBody() {
        return this.body;
    }

}
