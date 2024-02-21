// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainRealtimeLogDeliveryResponseBody body;

    public static DescribeDomainRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealtimeLogDeliveryResponse self = new DescribeDomainRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRealtimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainRealtimeLogDeliveryResponse setBody(DescribeDomainRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
