// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935.models;

import com.aliyun.tea.*;

public class AscpPurchasingConsignOrderReceivedFinishedErpSpiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AscpPurchasingConsignOrderReceivedFinishedErpSpiResponseBody body;

    public static AscpPurchasingConsignOrderReceivedFinishedErpSpiResponse build(java.util.Map<String, ?> map) throws Exception {
        AscpPurchasingConsignOrderReceivedFinishedErpSpiResponse self = new AscpPurchasingConsignOrderReceivedFinishedErpSpiResponse();
        return TeaModel.build(map, self);
    }

    public AscpPurchasingConsignOrderReceivedFinishedErpSpiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AscpPurchasingConsignOrderReceivedFinishedErpSpiResponse setBody(AscpPurchasingConsignOrderReceivedFinishedErpSpiResponseBody body) {
        this.body = body;
        return this;
    }
    public AscpPurchasingConsignOrderReceivedFinishedErpSpiResponseBody getBody() {
        return this.body;
    }

}
