// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssignPrivateIpAddressesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
