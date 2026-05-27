// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AssignWuyingServerPrivateAddressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssignWuyingServerPrivateAddressesResponseBody body;

    public static AssignWuyingServerPrivateAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignWuyingServerPrivateAddressesResponse self = new AssignWuyingServerPrivateAddressesResponse();
        return TeaModel.build(map, self);
    }

    public AssignWuyingServerPrivateAddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignWuyingServerPrivateAddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssignWuyingServerPrivateAddressesResponse setBody(AssignWuyingServerPrivateAddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignWuyingServerPrivateAddressesResponseBody getBody() {
        return this.body;
    }

}
