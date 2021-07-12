// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935.models;

import com.aliyun.tea.*;

public class AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponseBody body;

    public static AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponse build(java.util.Map<String, ?> map) throws Exception {
        AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponse self = new AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponse();
        return TeaModel.build(map, self);
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponse setBody(AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponseBody body) {
        this.body = body;
        return this;
    }
    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponseBody getBody() {
        return this.body;
    }

}
