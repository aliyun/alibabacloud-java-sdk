// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocateEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AllocateEipAddressResponseBody body;

    public static AllocateEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressResponse self = new AllocateEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public AllocateEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateEipAddressResponse setBody(AllocateEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateEipAddressResponseBody getBody() {
        return this.body;
    }

}
