// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935.models;

import com.aliyun.tea.*;

public class AscpPurchasingInboundOrderReceivedFinishedErpSpiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AscpPurchasingInboundOrderReceivedFinishedErpSpiResponseBody body;

    public static AscpPurchasingInboundOrderReceivedFinishedErpSpiResponse build(java.util.Map<String, ?> map) throws Exception {
        AscpPurchasingInboundOrderReceivedFinishedErpSpiResponse self = new AscpPurchasingInboundOrderReceivedFinishedErpSpiResponse();
        return TeaModel.build(map, self);
    }

    public AscpPurchasingInboundOrderReceivedFinishedErpSpiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AscpPurchasingInboundOrderReceivedFinishedErpSpiResponse setBody(AscpPurchasingInboundOrderReceivedFinishedErpSpiResponseBody body) {
        this.body = body;
        return this;
    }
    public AscpPurchasingInboundOrderReceivedFinishedErpSpiResponseBody getBody() {
        return this.body;
    }

}
