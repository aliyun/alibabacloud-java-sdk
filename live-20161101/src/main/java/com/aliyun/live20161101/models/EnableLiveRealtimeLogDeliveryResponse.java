// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EnableLiveRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableLiveRealtimeLogDeliveryResponseBody body;

    public static EnableLiveRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableLiveRealtimeLogDeliveryResponse self = new EnableLiveRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public EnableLiveRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableLiveRealtimeLogDeliveryResponse setBody(EnableLiveRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableLiveRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
