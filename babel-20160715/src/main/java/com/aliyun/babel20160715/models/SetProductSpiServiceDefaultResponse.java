// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class SetProductSpiServiceDefaultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetProductSpiServiceDefaultResponseBody body;

    public static SetProductSpiServiceDefaultResponse build(java.util.Map<String, ?> map) throws Exception {
        SetProductSpiServiceDefaultResponse self = new SetProductSpiServiceDefaultResponse();
        return TeaModel.build(map, self);
    }

    public SetProductSpiServiceDefaultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetProductSpiServiceDefaultResponse setBody(SetProductSpiServiceDefaultResponseBody body) {
        this.body = body;
        return this;
    }
    public SetProductSpiServiceDefaultResponseBody getBody() {
        return this.body;
    }

}
