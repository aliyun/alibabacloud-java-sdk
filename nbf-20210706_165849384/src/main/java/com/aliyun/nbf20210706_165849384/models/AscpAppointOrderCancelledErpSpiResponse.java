// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210706_165849384.models;

import com.aliyun.tea.*;

public class AscpAppointOrderCancelledErpSpiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AscpAppointOrderCancelledErpSpiResponseBody body;

    public static AscpAppointOrderCancelledErpSpiResponse build(java.util.Map<String, ?> map) throws Exception {
        AscpAppointOrderCancelledErpSpiResponse self = new AscpAppointOrderCancelledErpSpiResponse();
        return TeaModel.build(map, self);
    }

    public AscpAppointOrderCancelledErpSpiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AscpAppointOrderCancelledErpSpiResponse setBody(AscpAppointOrderCancelledErpSpiResponseBody body) {
        this.body = body;
        return this;
    }
    public AscpAppointOrderCancelledErpSpiResponseBody getBody() {
        return this.body;
    }

}
