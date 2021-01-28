// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class EnableDcdnDomainOfflineLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableDcdnDomainOfflineLogDeliveryResponseBody body;

    public static EnableDcdnDomainOfflineLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDcdnDomainOfflineLogDeliveryResponse self = new EnableDcdnDomainOfflineLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public EnableDcdnDomainOfflineLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDcdnDomainOfflineLogDeliveryResponse setBody(EnableDcdnDomainOfflineLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDcdnDomainOfflineLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
