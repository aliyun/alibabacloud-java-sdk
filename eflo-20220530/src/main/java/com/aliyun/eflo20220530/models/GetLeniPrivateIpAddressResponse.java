// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetLeniPrivateIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLeniPrivateIpAddressResponseBody body;

    public static GetLeniPrivateIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLeniPrivateIpAddressResponse self = new GetLeniPrivateIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public GetLeniPrivateIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLeniPrivateIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLeniPrivateIpAddressResponse setBody(GetLeniPrivateIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLeniPrivateIpAddressResponseBody getBody() {
        return this.body;
    }

}
