// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935.models;

import com.aliyun.tea.*;

public class AscpPurchasingPurchaseOrderCancelledErpSpiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AscpPurchasingPurchaseOrderCancelledErpSpiResponseBody body;

    public static AscpPurchasingPurchaseOrderCancelledErpSpiResponse build(java.util.Map<String, ?> map) throws Exception {
        AscpPurchasingPurchaseOrderCancelledErpSpiResponse self = new AscpPurchasingPurchaseOrderCancelledErpSpiResponse();
        return TeaModel.build(map, self);
    }

    public AscpPurchasingPurchaseOrderCancelledErpSpiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AscpPurchasingPurchaseOrderCancelledErpSpiResponse setBody(AscpPurchasingPurchaseOrderCancelledErpSpiResponseBody body) {
        this.body = body;
        return this;
    }
    public AscpPurchasingPurchaseOrderCancelledErpSpiResponseBody getBody() {
        return this.body;
    }

}
