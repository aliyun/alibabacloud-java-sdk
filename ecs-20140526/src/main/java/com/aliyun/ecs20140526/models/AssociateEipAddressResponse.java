// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssociateEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateEipAddressResponseBody body;

    public static AssociateEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateEipAddressResponse self = new AssociateEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public AssociateEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateEipAddressResponse setBody(AssociateEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateEipAddressResponseBody getBody() {
        return this.body;
    }

}
