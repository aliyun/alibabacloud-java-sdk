// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateAlarmRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAlarmRuleResponseBody body;

    public static UpdateAlarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlarmRuleResponse self = new UpdateAlarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlarmRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlarmRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlarmRuleResponse setBody(UpdateAlarmRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlarmRuleResponseBody getBody() {
        return this.body;
    }

}
