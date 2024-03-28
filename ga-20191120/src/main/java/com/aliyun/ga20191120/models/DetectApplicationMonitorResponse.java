// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DetectApplicationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectApplicationMonitorResponseBody body;

    public static DetectApplicationMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectApplicationMonitorResponse self = new DetectApplicationMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DetectApplicationMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectApplicationMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectApplicationMonitorResponse setBody(DetectApplicationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectApplicationMonitorResponseBody getBody() {
        return this.body;
    }

}
