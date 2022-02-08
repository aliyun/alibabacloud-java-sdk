// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class UpdateDISyncAlarmRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDISyncAlarmRuleResponseBody body;

    public static UpdateDISyncAlarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDISyncAlarmRuleResponse self = new UpdateDISyncAlarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDISyncAlarmRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDISyncAlarmRuleResponse setBody(UpdateDISyncAlarmRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDISyncAlarmRuleResponseBody getBody() {
        return this.body;
    }

}
