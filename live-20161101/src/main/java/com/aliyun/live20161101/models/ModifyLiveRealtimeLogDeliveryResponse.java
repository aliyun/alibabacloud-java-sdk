// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLiveRealtimeLogDeliveryResponseBody body;

    public static ModifyLiveRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveRealtimeLogDeliveryResponse self = new ModifyLiveRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLiveRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLiveRealtimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLiveRealtimeLogDeliveryResponse setBody(ModifyLiveRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLiveRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
