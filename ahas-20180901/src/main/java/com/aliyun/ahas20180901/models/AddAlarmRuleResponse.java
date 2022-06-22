// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AddAlarmRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddAlarmRuleResponseBody body;

    public static AddAlarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAlarmRuleResponse self = new AddAlarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddAlarmRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAlarmRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAlarmRuleResponse setBody(AddAlarmRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAlarmRuleResponseBody getBody() {
        return this.body;
    }

}
