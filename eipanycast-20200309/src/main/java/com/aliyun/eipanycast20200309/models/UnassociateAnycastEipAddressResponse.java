// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class UnassociateAnycastEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnassociateAnycastEipAddressResponseBody body;

    public static UnassociateAnycastEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateAnycastEipAddressResponse self = new UnassociateAnycastEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public UnassociateAnycastEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassociateAnycastEipAddressResponse setBody(UnassociateAnycastEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassociateAnycastEipAddressResponseBody getBody() {
        return this.body;
    }

}
