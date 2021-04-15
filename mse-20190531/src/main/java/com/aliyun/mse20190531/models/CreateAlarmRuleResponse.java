// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateAlarmRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAlarmRuleResponseBody body;

    public static CreateAlarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlarmRuleResponse self = new CreateAlarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlarmRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlarmRuleResponse setBody(CreateAlarmRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlarmRuleResponseBody getBody() {
        return this.body;
    }

}
