// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDIAlarmRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDIAlarmRuleResponseBody body;

    public static CreateDIAlarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDIAlarmRuleResponse self = new CreateDIAlarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateDIAlarmRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDIAlarmRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDIAlarmRuleResponse setBody(CreateDIAlarmRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDIAlarmRuleResponseBody getBody() {
        return this.body;
    }

}
