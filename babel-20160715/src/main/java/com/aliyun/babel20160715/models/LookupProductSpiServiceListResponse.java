// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class LookupProductSpiServiceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LookupProductSpiServiceListResponseBody body;

    public static LookupProductSpiServiceListResponse build(java.util.Map<String, ?> map) throws Exception {
        LookupProductSpiServiceListResponse self = new LookupProductSpiServiceListResponse();
        return TeaModel.build(map, self);
    }

    public LookupProductSpiServiceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LookupProductSpiServiceListResponse setBody(LookupProductSpiServiceListResponseBody body) {
        this.body = body;
        return this;
    }
    public LookupProductSpiServiceListResponseBody getBody() {
        return this.body;
    }

}
