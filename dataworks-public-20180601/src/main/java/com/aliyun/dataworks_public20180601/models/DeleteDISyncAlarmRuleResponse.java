// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class DeleteDISyncAlarmRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDISyncAlarmRuleResponseBody body;

    public static DeleteDISyncAlarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDISyncAlarmRuleResponse self = new DeleteDISyncAlarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDISyncAlarmRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDISyncAlarmRuleResponse setBody(DeleteDISyncAlarmRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDISyncAlarmRuleResponseBody getBody() {
        return this.body;
    }

}
