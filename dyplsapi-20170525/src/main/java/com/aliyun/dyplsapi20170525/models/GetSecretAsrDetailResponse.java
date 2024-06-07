// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetSecretAsrDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecretAsrDetailResponseBody body;

    public static GetSecretAsrDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecretAsrDetailResponse self = new GetSecretAsrDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSecretAsrDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecretAsrDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecretAsrDetailResponse setBody(GetSecretAsrDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecretAsrDetailResponseBody getBody() {
        return this.body;
    }

}
