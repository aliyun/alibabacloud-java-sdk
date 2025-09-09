// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetKyuubiTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKyuubiTokenResponseBody body;

    public static GetKyuubiTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKyuubiTokenResponse self = new GetKyuubiTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetKyuubiTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKyuubiTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKyuubiTokenResponse setBody(GetKyuubiTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKyuubiTokenResponseBody getBody() {
        return this.body;
    }

}
