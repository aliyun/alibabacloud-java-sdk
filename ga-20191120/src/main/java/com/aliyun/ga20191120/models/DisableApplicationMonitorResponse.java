// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DisableApplicationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableApplicationMonitorResponseBody body;

    public static DisableApplicationMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationMonitorResponse self = new DisableApplicationMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DisableApplicationMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableApplicationMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableApplicationMonitorResponse setBody(DisableApplicationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableApplicationMonitorResponseBody getBody() {
        return this.body;
    }

}
