// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDIAlarmRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDIAlarmRuleResponseBody body;

    public static UpdateDIAlarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIAlarmRuleResponse self = new UpdateDIAlarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDIAlarmRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDIAlarmRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDIAlarmRuleResponse setBody(UpdateDIAlarmRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDIAlarmRuleResponseBody getBody() {
        return this.body;
    }

}
