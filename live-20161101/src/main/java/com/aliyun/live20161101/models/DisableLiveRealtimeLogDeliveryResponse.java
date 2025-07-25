// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DisableLiveRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableLiveRealtimeLogDeliveryResponseBody body;

    public static DisableLiveRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableLiveRealtimeLogDeliveryResponse self = new DisableLiveRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public DisableLiveRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableLiveRealtimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableLiveRealtimeLogDeliveryResponse setBody(DisableLiveRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableLiveRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
