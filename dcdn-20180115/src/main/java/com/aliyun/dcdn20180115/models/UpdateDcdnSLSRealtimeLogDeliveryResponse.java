// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnSLSRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDcdnSLSRealtimeLogDeliveryResponseBody body;

    public static UpdateDcdnSLSRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnSLSRealtimeLogDeliveryResponse self = new UpdateDcdnSLSRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnSLSRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDcdnSLSRealtimeLogDeliveryResponse setBody(UpdateDcdnSLSRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDcdnSLSRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
