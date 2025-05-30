// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetLniPrivateIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLniPrivateIpAddressResponseBody body;

    public static GetLniPrivateIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLniPrivateIpAddressResponse self = new GetLniPrivateIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public GetLniPrivateIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLniPrivateIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLniPrivateIpAddressResponse setBody(GetLniPrivateIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLniPrivateIpAddressResponseBody getBody() {
        return this.body;
    }

}
