// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class EnableProductSpiServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableProductSpiServiceResponseBody body;

    public static EnableProductSpiServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableProductSpiServiceResponse self = new EnableProductSpiServiceResponse();
        return TeaModel.build(map, self);
    }

    public EnableProductSpiServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableProductSpiServiceResponse setBody(EnableProductSpiServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableProductSpiServiceResponseBody getBody() {
        return this.body;
    }

}
