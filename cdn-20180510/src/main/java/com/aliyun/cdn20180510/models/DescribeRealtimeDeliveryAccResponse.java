// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRealtimeDeliveryAccResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRealtimeDeliveryAccResponseBody body;

    public static DescribeRealtimeDeliveryAccResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRealtimeDeliveryAccResponse self = new DescribeRealtimeDeliveryAccResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRealtimeDeliveryAccResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRealtimeDeliveryAccResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRealtimeDeliveryAccResponse setBody(DescribeRealtimeDeliveryAccResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRealtimeDeliveryAccResponseBody getBody() {
        return this.body;
    }

}
