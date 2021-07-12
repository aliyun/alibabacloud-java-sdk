// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210706_165849384.models;

import com.aliyun.tea.*;

public class AscpAppointOrderDoFinishedErpSpiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AscpAppointOrderDoFinishedErpSpiResponseBody body;

    public static AscpAppointOrderDoFinishedErpSpiResponse build(java.util.Map<String, ?> map) throws Exception {
        AscpAppointOrderDoFinishedErpSpiResponse self = new AscpAppointOrderDoFinishedErpSpiResponse();
        return TeaModel.build(map, self);
    }

    public AscpAppointOrderDoFinishedErpSpiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AscpAppointOrderDoFinishedErpSpiResponse setBody(AscpAppointOrderDoFinishedErpSpiResponseBody body) {
        this.body = body;
        return this;
    }
    public AscpAppointOrderDoFinishedErpSpiResponseBody getBody() {
        return this.body;
    }

}
