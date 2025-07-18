// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLiveRealtimeLogDeliveryResponseBody body;

    public static ListLiveRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRealtimeLogDeliveryResponse self = new ListLiveRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveRealtimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveRealtimeLogDeliveryResponse setBody(ListLiveRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
