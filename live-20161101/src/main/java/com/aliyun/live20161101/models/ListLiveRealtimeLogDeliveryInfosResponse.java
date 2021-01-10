// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListLiveRealtimeLogDeliveryInfosResponse setBody(ListLiveRealtimeLogDeliveryInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveRealtimeLogDeliveryInfosResponseBody getBody() {
        return this.body;
    }

}
