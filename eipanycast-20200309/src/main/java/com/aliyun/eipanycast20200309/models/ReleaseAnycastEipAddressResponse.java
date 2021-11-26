// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ReleaseAnycastEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseAnycastEipAddressResponseBody body;

    public static ReleaseAnycastEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAnycastEipAddressResponse self = new ReleaseAnycastEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseAnycastEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseAnycastEipAddressResponse setBody(ReleaseAnycastEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseAnycastEipAddressResponseBody getBody() {
        return this.body;
    }

}
