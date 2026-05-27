// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UnassignWuyingServerPrivateAddressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnassignWuyingServerPrivateAddressesResponseBody body;

    public static UnassignWuyingServerPrivateAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassignWuyingServerPrivateAddressesResponse self = new UnassignWuyingServerPrivateAddressesResponse();
        return TeaModel.build(map, self);
    }

    public UnassignWuyingServerPrivateAddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassignWuyingServerPrivateAddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnassignWuyingServerPrivateAddressesResponse setBody(UnassignWuyingServerPrivateAddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassignWuyingServerPrivateAddressesResponseBody getBody() {
        return this.body;
    }

}
