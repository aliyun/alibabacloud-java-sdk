// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetLivyComputeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLivyComputeResponseBody body;

    public static GetLivyComputeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLivyComputeResponse self = new GetLivyComputeResponse();
        return TeaModel.build(map, self);
    }

    public GetLivyComputeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLivyComputeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLivyComputeResponse setBody(GetLivyComputeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLivyComputeResponseBody getBody() {
        return this.body;
    }

}
