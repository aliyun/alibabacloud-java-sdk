// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateInstanceInternetAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInstanceInternetAddressResponseBody body;

    public static CreateInstanceInternetAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceInternetAddressResponse self = new CreateInstanceInternetAddressResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceInternetAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceInternetAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceInternetAddressResponse setBody(CreateInstanceInternetAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceInternetAddressResponseBody getBody() {
        return this.body;
    }

}
