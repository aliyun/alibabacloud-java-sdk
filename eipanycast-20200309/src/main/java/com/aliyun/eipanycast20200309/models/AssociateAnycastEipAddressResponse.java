// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class AssociateAnycastEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateAnycastEipAddressResponseBody body;

    public static AssociateAnycastEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateAnycastEipAddressResponse self = new AssociateAnycastEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public AssociateAnycastEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateAnycastEipAddressResponse setBody(AssociateAnycastEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateAnycastEipAddressResponseBody getBody() {
        return this.body;
    }

}
