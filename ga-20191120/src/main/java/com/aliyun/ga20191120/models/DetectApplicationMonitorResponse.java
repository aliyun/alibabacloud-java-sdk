// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DetectApplicationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DetectApplicationMonitorResponse setBody(DetectApplicationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectApplicationMonitorResponseBody getBody() {
        return this.body;
    }

}
