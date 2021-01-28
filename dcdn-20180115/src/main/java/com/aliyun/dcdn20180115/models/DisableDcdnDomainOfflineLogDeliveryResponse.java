// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DisableDcdnDomainOfflineLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableDcdnDomainOfflineLogDeliveryResponseBody body;

    public static DisableDcdnDomainOfflineLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDcdnDomainOfflineLogDeliveryResponse self = new DisableDcdnDomainOfflineLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public DisableDcdnDomainOfflineLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDcdnDomainOfflineLogDeliveryResponse setBody(DisableDcdnDomainOfflineLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDcdnDomainOfflineLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
