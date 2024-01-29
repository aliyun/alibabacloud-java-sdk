// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ValidatePdnsUdpIpSegmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidatePdnsUdpIpSegmentResponseBody body;

    public static ValidatePdnsUdpIpSegmentResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidatePdnsUdpIpSegmentResponse self = new ValidatePdnsUdpIpSegmentResponse();
        return TeaModel.build(map, self);
    }

    public ValidatePdnsUdpIpSegmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidatePdnsUdpIpSegmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidatePdnsUdpIpSegmentResponse setBody(ValidatePdnsUdpIpSegmentResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidatePdnsUdpIpSegmentResponseBody getBody() {
        return this.body;
    }

}
