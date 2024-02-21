// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRealtimeLogDeliveryResponseBody body;

    public static DeleteRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRealtimeLogDeliveryResponse self = new DeleteRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRealtimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRealtimeLogDeliveryResponse setBody(DeleteRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
