// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLiveRealtimeLogDeliveryInfosResponseBody body;

    public static ListLiveRealtimeLogDeliveryInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRealtimeLogDeliveryInfosResponse self = new ListLiveRealtimeLogDeliveryInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveRealtimeLogDeliveryInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveRealtimeLogDeliveryInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveRealtimeLogDeliveryInfosResponse setBody(ListLiveRealtimeLogDeliveryInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveRealtimeLogDeliveryInfosResponseBody getBody() {
        return this.body;
    }

}
