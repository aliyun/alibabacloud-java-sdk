// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AssignPrivateIpAddressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssignPrivateIpAddressesResponseBody body;

    public static AssignPrivateIpAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignPrivateIpAddressesResponse self = new AssignPrivateIpAddressesResponse();
        return TeaModel.build(map, self);
    }

    public AssignPrivateIpAddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignPrivateIpAddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssignPrivateIpAddressesResponse setBody(AssignPrivateIpAddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignPrivateIpAddressesResponseBody getBody() {
        return this.body;
    }

}
