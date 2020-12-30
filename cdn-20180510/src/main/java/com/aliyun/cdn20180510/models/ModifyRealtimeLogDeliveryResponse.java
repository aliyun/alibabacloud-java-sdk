// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyRealtimeLogDeliveryResponseBody body;

    public static ModifyRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRealtimeLogDeliveryResponse self = new ModifyRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRealtimeLogDeliveryResponse setBody(ModifyRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
