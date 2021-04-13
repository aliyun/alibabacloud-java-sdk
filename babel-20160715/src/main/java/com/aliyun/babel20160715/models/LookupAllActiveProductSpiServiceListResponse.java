// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class LookupAllActiveProductSpiServiceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LookupAllActiveProductSpiServiceListResponseBody body;

    public static LookupAllActiveProductSpiServiceListResponse build(java.util.Map<String, ?> map) throws Exception {
        LookupAllActiveProductSpiServiceListResponse self = new LookupAllActiveProductSpiServiceListResponse();
        return TeaModel.build(map, self);
    }

    public LookupAllActiveProductSpiServiceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LookupAllActiveProductSpiServiceListResponse setBody(LookupAllActiveProductSpiServiceListResponseBody body) {
        this.body = body;
        return this;
    }
    public LookupAllActiveProductSpiServiceListResponseBody getBody() {
        return this.body;
    }

}
