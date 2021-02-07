// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetSecretAsrDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetSecretAsrDetailResponse setBody(GetSecretAsrDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecretAsrDetailResponseBody getBody() {
        return this.body;
    }

}
