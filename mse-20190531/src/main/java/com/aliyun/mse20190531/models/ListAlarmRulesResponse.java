// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAlarmRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlarmRulesResponseBody body;

    public static ListAlarmRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmRulesResponse self = new ListAlarmRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListAlarmRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlarmRulesResponse setBody(ListAlarmRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlarmRulesResponseBody getBody() {
        return this.body;
    }

}
