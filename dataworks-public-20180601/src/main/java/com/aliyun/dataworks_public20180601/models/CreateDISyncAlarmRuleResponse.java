// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class CreateDISyncAlarmRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDISyncAlarmRuleResponseBody body;

    public static CreateDISyncAlarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDISyncAlarmRuleResponse self = new CreateDISyncAlarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateDISyncAlarmRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDISyncAlarmRuleResponse setBody(CreateDISyncAlarmRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDISyncAlarmRuleResponseBody getBody() {
        return this.body;
    }

}
