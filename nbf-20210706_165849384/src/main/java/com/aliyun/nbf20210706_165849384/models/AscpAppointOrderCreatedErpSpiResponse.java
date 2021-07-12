// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210706_165849384.models;

import com.aliyun.tea.*;

public class AscpAppointOrderCreatedErpSpiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AscpAppointOrderCreatedErpSpiResponseBody body;

    public static AscpAppointOrderCreatedErpSpiResponse build(java.util.Map<String, ?> map) throws Exception {
        AscpAppointOrderCreatedErpSpiResponse self = new AscpAppointOrderCreatedErpSpiResponse();
        return TeaModel.build(map, self);
    }

    public AscpAppointOrderCreatedErpSpiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AscpAppointOrderCreatedErpSpiResponse setBody(AscpAppointOrderCreatedErpSpiResponseBody body) {
        this.body = body;
        return this;
    }
    public AscpAppointOrderCreatedErpSpiResponseBody getBody() {
        return this.body;
    }

}
