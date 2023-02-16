// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UnAssignPrivateIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnAssignPrivateIpAddressResponseBody body;

    public static UnAssignPrivateIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        UnAssignPrivateIpAddressResponse self = new UnAssignPrivateIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public UnAssignPrivateIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnAssignPrivateIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnAssignPrivateIpAddressResponse setBody(UnAssignPrivateIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public UnAssignPrivateIpAddressResponseBody getBody() {
        return this.body;
    }

}
