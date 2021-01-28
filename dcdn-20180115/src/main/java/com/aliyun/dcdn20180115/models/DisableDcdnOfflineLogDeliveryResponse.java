// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DisableDcdnOfflineLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableDcdnOfflineLogDeliveryResponseBody body;

    public static DisableDcdnOfflineLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDcdnOfflineLogDeliveryResponse self = new DisableDcdnOfflineLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public DisableDcdnOfflineLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDcdnOfflineLogDeliveryResponse setBody(DisableDcdnOfflineLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDcdnOfflineLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
