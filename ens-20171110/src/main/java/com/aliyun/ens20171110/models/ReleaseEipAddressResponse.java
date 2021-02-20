// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleaseEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseEipAddressResponseBody body;

    public static ReleaseEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseEipAddressResponse self = new ReleaseEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseEipAddressResponse setBody(ReleaseEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseEipAddressResponseBody getBody() {
        return this.body;
    }

}
