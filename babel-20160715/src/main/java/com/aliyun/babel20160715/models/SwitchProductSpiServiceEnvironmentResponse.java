// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class SwitchProductSpiServiceEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchProductSpiServiceEnvironmentResponseBody body;

    public static SwitchProductSpiServiceEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchProductSpiServiceEnvironmentResponse self = new SwitchProductSpiServiceEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public SwitchProductSpiServiceEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchProductSpiServiceEnvironmentResponse setBody(SwitchProductSpiServiceEnvironmentResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchProductSpiServiceEnvironmentResponseBody getBody() {
        return this.body;
    }

}
