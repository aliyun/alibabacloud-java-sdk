// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSLSRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnSLSRealtimeLogDeliveryResponseBody body;

    public static DescribeDcdnSLSRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSLSRealtimeLogDeliveryResponse self = new DescribeDcdnSLSRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSLSRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnSLSRealtimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnSLSRealtimeLogDeliveryResponse setBody(DescribeDcdnSLSRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnSLSRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
