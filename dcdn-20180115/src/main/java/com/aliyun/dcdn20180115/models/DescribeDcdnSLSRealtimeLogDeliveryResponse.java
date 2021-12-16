// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSLSRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnSLSRealtimeLogDeliveryResponse setBody(DescribeDcdnSLSRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnSLSRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
