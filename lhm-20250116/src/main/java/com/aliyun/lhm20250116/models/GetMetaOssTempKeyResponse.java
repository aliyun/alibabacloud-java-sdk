// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetMetaOssTempKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetaOssTempKeyResponseBody body;

    public static GetMetaOssTempKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaOssTempKeyResponse self = new GetMetaOssTempKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaOssTempKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaOssTempKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetaOssTempKeyResponse setBody(GetMetaOssTempKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaOssTempKeyResponseBody getBody() {
        return this.body;
    }

}
