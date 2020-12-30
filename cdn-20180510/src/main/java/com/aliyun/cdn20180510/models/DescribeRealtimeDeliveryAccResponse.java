// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRealtimeDeliveryAccResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeRealtimeDeliveryAccResponse setBody(DescribeRealtimeDeliveryAccResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRealtimeDeliveryAccResponseBody getBody() {
        return this.body;
    }

}
