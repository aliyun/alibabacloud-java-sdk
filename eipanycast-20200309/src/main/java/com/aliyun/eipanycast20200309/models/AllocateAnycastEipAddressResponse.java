// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class AllocateAnycastEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AllocateAnycastEipAddressResponseBody body;

    public static AllocateAnycastEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateAnycastEipAddressResponse self = new AllocateAnycastEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public AllocateAnycastEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateAnycastEipAddressResponse setBody(AllocateAnycastEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateAnycastEipAddressResponseBody getBody() {
        return this.body;
    }

}
