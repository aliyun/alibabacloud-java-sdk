// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveRealtimeLogDeliveryResponseBody body;

    public static DeleteLiveRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRealtimeLogDeliveryResponse self = new DeleteLiveRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveRealtimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveRealtimeLogDeliveryResponse setBody(DeleteLiveRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
