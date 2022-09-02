// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class GetStorageSignatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetStorageSignatureResponseBody body;

    public static GetStorageSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStorageSignatureResponse self = new GetStorageSignatureResponse();
        return TeaModel.build(map, self);
    }

    public GetStorageSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStorageSignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStorageSignatureResponse setBody(GetStorageSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStorageSignatureResponseBody getBody() {
        return this.body;
    }

}
