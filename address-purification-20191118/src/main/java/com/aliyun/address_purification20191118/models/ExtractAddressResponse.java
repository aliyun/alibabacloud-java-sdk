// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118.models;

import com.aliyun.tea.*;

public class ExtractAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExtractAddressResponseBody body;

    public static ExtractAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtractAddressResponse self = new ExtractAddressResponse();
        return TeaModel.build(map, self);
    }

    public ExtractAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExtractAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExtractAddressResponse setBody(ExtractAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ExtractAddressResponseBody getBody() {
        return this.body;
    }

}
