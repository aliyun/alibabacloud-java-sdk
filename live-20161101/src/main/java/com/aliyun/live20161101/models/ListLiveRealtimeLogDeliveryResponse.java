// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListLiveRealtimeLogDeliveryResponse setBody(ListLiveRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
