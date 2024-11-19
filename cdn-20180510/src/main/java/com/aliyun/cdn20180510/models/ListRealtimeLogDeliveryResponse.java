// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRealtimeLogDeliveryResponseBody body;

    public static ListRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeLogDeliveryResponse self = new ListRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public ListRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRealtimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRealtimeLogDeliveryResponse setBody(ListRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
