// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetClientKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetClientKeyResponseBody body;

    public static GetClientKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClientKeyResponse self = new GetClientKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetClientKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClientKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClientKeyResponse setBody(GetClientKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClientKeyResponseBody getBody() {
        return this.body;
    }

}
