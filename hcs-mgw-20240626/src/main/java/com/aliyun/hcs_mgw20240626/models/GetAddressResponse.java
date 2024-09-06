// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAddressResponseBody body;

    public static GetAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAddressResponse self = new GetAddressResponse();
        return TeaModel.build(map, self);
    }

    public GetAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAddressResponse setBody(GetAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAddressResponseBody getBody() {
        return this.body;
    }

}
