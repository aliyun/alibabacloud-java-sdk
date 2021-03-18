// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocatePublicIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AllocatePublicIpAddressResponseBody body;

    public static AllocatePublicIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicIpAddressResponse self = new AllocatePublicIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public AllocatePublicIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocatePublicIpAddressResponse setBody(AllocatePublicIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocatePublicIpAddressResponseBody getBody() {
        return this.body;
    }

}
