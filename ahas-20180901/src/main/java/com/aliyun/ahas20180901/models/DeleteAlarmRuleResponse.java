// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteAlarmRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAlarmRuleResponseBody body;

    public static DeleteAlarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlarmRuleResponse self = new DeleteAlarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlarmRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlarmRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlarmRuleResponse setBody(DeleteAlarmRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlarmRuleResponseBody getBody() {
        return this.body;
    }

}
