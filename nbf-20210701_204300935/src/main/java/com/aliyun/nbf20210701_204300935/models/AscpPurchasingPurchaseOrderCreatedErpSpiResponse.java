// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935.models;

import com.aliyun.tea.*;

public class AscpPurchasingPurchaseOrderCreatedErpSpiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AscpPurchasingPurchaseOrderCreatedErpSpiResponseBody body;

    public static AscpPurchasingPurchaseOrderCreatedErpSpiResponse build(java.util.Map<String, ?> map) throws Exception {
        AscpPurchasingPurchaseOrderCreatedErpSpiResponse self = new AscpPurchasingPurchaseOrderCreatedErpSpiResponse();
        return TeaModel.build(map, self);
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiResponse setBody(AscpPurchasingPurchaseOrderCreatedErpSpiResponseBody body) {
        this.body = body;
        return this;
    }
    public AscpPurchasingPurchaseOrderCreatedErpSpiResponseBody getBody() {
        return this.body;
    }

}
