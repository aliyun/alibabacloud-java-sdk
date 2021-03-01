// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class SwitchAdvancedMonitoringResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchAdvancedMonitoringResponseBody body;

    public static SwitchAdvancedMonitoringResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchAdvancedMonitoringResponse self = new SwitchAdvancedMonitoringResponse();
        return TeaModel.build(map, self);
    }

    public SwitchAdvancedMonitoringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchAdvancedMonitoringResponse setBody(SwitchAdvancedMonitoringResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchAdvancedMonitoringResponseBody getBody() {
        return this.body;
    }

}
