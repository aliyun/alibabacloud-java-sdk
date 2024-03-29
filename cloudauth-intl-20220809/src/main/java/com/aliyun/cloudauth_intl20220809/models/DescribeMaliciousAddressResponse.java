// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeMaliciousAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMaliciousAddressResponseBody body;

    public static DescribeMaliciousAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMaliciousAddressResponse self = new DescribeMaliciousAddressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMaliciousAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMaliciousAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMaliciousAddressResponse setBody(DescribeMaliciousAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMaliciousAddressResponseBody getBody() {
        return this.body;
    }

}
