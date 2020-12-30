// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListRealtimeLogDeliveryInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRealtimeLogDeliveryInfosResponseBody body;

    public static ListRealtimeLogDeliveryInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeLogDeliveryInfosResponse self = new ListRealtimeLogDeliveryInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListRealtimeLogDeliveryInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRealtimeLogDeliveryInfosResponse setBody(ListRealtimeLogDeliveryInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRealtimeLogDeliveryInfosResponseBody getBody() {
        return this.body;
    }

}
