// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetOssSignatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOssSignatureResponseBody body;

    public static GetOssSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssSignatureResponse self = new GetOssSignatureResponse();
        return TeaModel.build(map, self);
    }

    public GetOssSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssSignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssSignatureResponse setBody(GetOssSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssSignatureResponseBody getBody() {
        return this.body;
    }

}
