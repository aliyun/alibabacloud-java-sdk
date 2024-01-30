// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class SwitchAdvancedMonitoringResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SwitchAdvancedMonitoringResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchAdvancedMonitoringResponse setBody(SwitchAdvancedMonitoringResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchAdvancedMonitoringResponseBody getBody() {
        return this.body;
    }

}
