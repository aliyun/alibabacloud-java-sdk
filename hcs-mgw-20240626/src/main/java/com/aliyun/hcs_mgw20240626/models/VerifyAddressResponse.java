// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class VerifyAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyAddressResponseBody body;

    public static VerifyAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAddressResponse self = new VerifyAddressResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyAddressResponse setBody(VerifyAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyAddressResponseBody getBody() {
        return this.body;
    }

}
