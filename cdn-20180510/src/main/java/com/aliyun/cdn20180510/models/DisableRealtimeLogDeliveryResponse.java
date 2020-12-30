// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DisableRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableRealtimeLogDeliveryResponseBody body;

    public static DisableRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableRealtimeLogDeliveryResponse self = new DisableRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public DisableRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableRealtimeLogDeliveryResponse setBody(DisableRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
