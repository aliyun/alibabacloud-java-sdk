// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class EnableRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableRealtimeLogDeliveryResponseBody body;

    public static EnableRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableRealtimeLogDeliveryResponse self = new EnableRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public EnableRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableRealtimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableRealtimeLogDeliveryResponse setBody(EnableRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
