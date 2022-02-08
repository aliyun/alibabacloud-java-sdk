// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class GetDISyncAlarmRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDISyncAlarmRuleResponseBody body;

    public static GetDISyncAlarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncAlarmRuleResponse self = new GetDISyncAlarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetDISyncAlarmRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDISyncAlarmRuleResponse setBody(GetDISyncAlarmRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDISyncAlarmRuleResponseBody getBody() {
        return this.body;
    }

}
