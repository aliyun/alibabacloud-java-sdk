// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeLiveDomainRealtimeLogDeliveryResponse setBody(DescribeLiveDomainRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
