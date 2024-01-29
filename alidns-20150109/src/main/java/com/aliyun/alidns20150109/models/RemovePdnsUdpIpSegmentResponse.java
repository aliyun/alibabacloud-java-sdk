// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RemovePdnsUdpIpSegmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemovePdnsUdpIpSegmentResponseBody body;

    public static RemovePdnsUdpIpSegmentResponse build(java.util.Map<String, ?> map) throws Exception {
        RemovePdnsUdpIpSegmentResponse self = new RemovePdnsUdpIpSegmentResponse();
        return TeaModel.build(map, self);
    }

    public RemovePdnsUdpIpSegmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemovePdnsUdpIpSegmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemovePdnsUdpIpSegmentResponse setBody(RemovePdnsUdpIpSegmentResponseBody body) {
        this.body = body;
        return this;
    }
    public RemovePdnsUdpIpSegmentResponseBody getBody() {
        return this.body;
    }

}
