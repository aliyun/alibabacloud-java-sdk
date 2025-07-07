// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetLivyComputeTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLivyComputeTokenResponseBody body;

    public static GetLivyComputeTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLivyComputeTokenResponse self = new GetLivyComputeTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetLivyComputeTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLivyComputeTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLivyComputeTokenResponse setBody(GetLivyComputeTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLivyComputeTokenResponseBody getBody() {
        return this.body;
    }

}
