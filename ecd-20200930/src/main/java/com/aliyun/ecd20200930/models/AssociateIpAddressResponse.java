// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AssociateIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateIpAddressResponseBody body;

    public static AssociateIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateIpAddressResponse self = new AssociateIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public AssociateIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateIpAddressResponse setBody(AssociateIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateIpAddressResponseBody getBody() {
        return this.body;
    }

}
