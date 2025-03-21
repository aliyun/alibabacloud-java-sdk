// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class AssignPrivateIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssignPrivateIpAddressResponseBody body;

    public static AssignPrivateIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignPrivateIpAddressResponse self = new AssignPrivateIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public AssignPrivateIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignPrivateIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssignPrivateIpAddressResponse setBody(AssignPrivateIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignPrivateIpAddressResponseBody getBody() {
        return this.body;
    }

}
