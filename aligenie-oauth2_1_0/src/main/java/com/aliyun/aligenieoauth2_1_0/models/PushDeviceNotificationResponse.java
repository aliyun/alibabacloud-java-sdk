// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class PushDeviceNotificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushDeviceNotificationResponseBody body;

    public static PushDeviceNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        PushDeviceNotificationResponse self = new PushDeviceNotificationResponse();
        return TeaModel.build(map, self);
    }

    public PushDeviceNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushDeviceNotificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushDeviceNotificationResponse setBody(PushDeviceNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public PushDeviceNotificationResponseBody getBody() {
        return this.body;
    }

}
