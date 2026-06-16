// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class GetCaInstanceCrlAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCaInstanceCrlAddressResponseBody body;

    public static GetCaInstanceCrlAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCaInstanceCrlAddressResponse self = new GetCaInstanceCrlAddressResponse();
        return TeaModel.build(map, self);
    }

    public GetCaInstanceCrlAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCaInstanceCrlAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCaInstanceCrlAddressResponse setBody(GetCaInstanceCrlAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCaInstanceCrlAddressResponseBody getBody() {
        return this.body;
    }

}
