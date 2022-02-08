// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListDISyncAlarmRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDISyncAlarmRulesResponseBody body;

    public static ListDISyncAlarmRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDISyncAlarmRulesResponse self = new ListDISyncAlarmRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListDISyncAlarmRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDISyncAlarmRulesResponse setBody(ListDISyncAlarmRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDISyncAlarmRulesResponseBody getBody() {
        return this.body;
    }

}
