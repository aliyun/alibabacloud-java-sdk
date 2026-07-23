// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetManagedDataKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetManagedDataKeyResponseBody body;

    public static GetManagedDataKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetManagedDataKeyResponse self = new GetManagedDataKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetManagedDataKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetManagedDataKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetManagedDataKeyResponse setBody(GetManagedDataKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetManagedDataKeyResponseBody getBody() {
        return this.body;
    }

}
