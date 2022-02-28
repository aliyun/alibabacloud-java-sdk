// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateDrGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDrGatewayResponseBody body;

    public static UpdateDrGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDrGatewayResponse self = new UpdateDrGatewayResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDrGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDrGatewayResponse setBody(UpdateDrGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDrGatewayResponseBody getBody() {
        return this.body;
    }

}
