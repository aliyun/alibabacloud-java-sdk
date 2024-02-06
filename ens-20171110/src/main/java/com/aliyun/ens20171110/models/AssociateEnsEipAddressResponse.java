// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AssociateEnsEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AssociateEnsEipAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateEnsEipAddressResponse setBody(AssociateEnsEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateEnsEipAddressResponseBody getBody() {
        return this.body;
    }

}
