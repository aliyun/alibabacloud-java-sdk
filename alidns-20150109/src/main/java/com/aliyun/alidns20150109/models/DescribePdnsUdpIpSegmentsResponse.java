// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsUdpIpSegmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePdnsUdpIpSegmentsResponseBody body;

    public static DescribePdnsUdpIpSegmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsUdpIpSegmentsResponse self = new DescribePdnsUdpIpSegmentsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePdnsUdpIpSegmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePdnsUdpIpSegmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePdnsUdpIpSegmentsResponse setBody(DescribePdnsUdpIpSegmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePdnsUdpIpSegmentsResponseBody getBody() {
        return this.body;
    }

}
