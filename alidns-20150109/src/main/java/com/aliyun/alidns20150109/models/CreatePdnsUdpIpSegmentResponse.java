// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreatePdnsUdpIpSegmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePdnsUdpIpSegmentResponseBody body;

    public static CreatePdnsUdpIpSegmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePdnsUdpIpSegmentResponse self = new CreatePdnsUdpIpSegmentResponse();
        return TeaModel.build(map, self);
    }

    public CreatePdnsUdpIpSegmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePdnsUdpIpSegmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePdnsUdpIpSegmentResponse setBody(CreatePdnsUdpIpSegmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePdnsUdpIpSegmentResponseBody getBody() {
        return this.body;
    }

}
