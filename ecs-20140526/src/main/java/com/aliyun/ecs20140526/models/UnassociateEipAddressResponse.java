// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class UnassociateEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnassociateEipAddressResponseBody body;

    public static UnassociateEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateEipAddressResponse self = new UnassociateEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public UnassociateEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassociateEipAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnassociateEipAddressResponse setBody(UnassociateEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassociateEipAddressResponseBody getBody() {
        return this.body;
    }

}
