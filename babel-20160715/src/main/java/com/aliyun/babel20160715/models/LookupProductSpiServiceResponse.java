// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class LookupProductSpiServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LookupProductSpiServiceResponseBody body;

    public static LookupProductSpiServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        LookupProductSpiServiceResponse self = new LookupProductSpiServiceResponse();
        return TeaModel.build(map, self);
    }

    public LookupProductSpiServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LookupProductSpiServiceResponse setBody(LookupProductSpiServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public LookupProductSpiServiceResponseBody getBody() {
        return this.body;
    }

}
