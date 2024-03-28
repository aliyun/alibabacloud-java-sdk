// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class EnableApplicationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableApplicationMonitorResponseBody body;

    public static EnableApplicationMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationMonitorResponse self = new EnableApplicationMonitorResponse();
        return TeaModel.build(map, self);
    }

    public EnableApplicationMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableApplicationMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableApplicationMonitorResponse setBody(EnableApplicationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableApplicationMonitorResponseBody getBody() {
        return this.body;
    }

}
