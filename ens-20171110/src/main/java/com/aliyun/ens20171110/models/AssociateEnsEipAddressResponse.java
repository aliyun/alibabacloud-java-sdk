// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AssociateEnsEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateEnsEipAddressResponseBody body;

    public static AssociateEnsEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateEnsEipAddressResponse self = new AssociateEnsEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public AssociateEnsEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateEnsEipAddressResponse setBody(AssociateEnsEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateEnsEipAddressResponseBody getBody() {
        return this.body;
    }

}
