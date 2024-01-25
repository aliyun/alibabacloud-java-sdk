// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class UnassociateAnycastEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UnassociateAnycastEipAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnassociateAnycastEipAddressResponse setBody(UnassociateAnycastEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassociateAnycastEipAddressResponseBody getBody() {
        return this.body;
    }

}
