// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnAssociateEnsEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnAssociateEnsEipAddressResponseBody body;

    public static UnAssociateEnsEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        UnAssociateEnsEipAddressResponse self = new UnAssociateEnsEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public UnAssociateEnsEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnAssociateEnsEipAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnAssociateEnsEipAddressResponse setBody(UnAssociateEnsEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public UnAssociateEnsEipAddressResponseBody getBody() {
        return this.body;
    }

}
