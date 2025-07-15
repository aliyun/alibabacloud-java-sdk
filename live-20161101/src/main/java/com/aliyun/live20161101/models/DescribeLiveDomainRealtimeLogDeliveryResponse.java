// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDomainRealtimeLogDeliveryResponseBody body;

    public static DescribeLiveDomainRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealtimeLogDeliveryResponse self = new DescribeLiveDomainRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponse setBody(DescribeLiveDomainRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
