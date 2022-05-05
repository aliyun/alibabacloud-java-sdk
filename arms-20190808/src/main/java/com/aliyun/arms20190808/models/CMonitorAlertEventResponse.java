// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CMonitorAlertEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CMonitorAlertEventResponseBody body;

    public static CMonitorAlertEventResponse build(java.util.Map<String, ?> map) throws Exception {
        CMonitorAlertEventResponse self = new CMonitorAlertEventResponse();
        return TeaModel.build(map, self);
    }

    public CMonitorAlertEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CMonitorAlertEventResponse setBody(CMonitorAlertEventResponseBody body) {
        this.body = body;
        return this;
    }
    public CMonitorAlertEventResponseBody getBody() {
        return this.body;
    }

}
