// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlgorithmDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlgorithmDataResponseBody body;

    public static GetAlgorithmDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDataResponse self = new GetAlgorithmDataResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgorithmDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlgorithmDataResponse setBody(GetAlgorithmDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgorithmDataResponseBody getBody() {
        return this.body;
    }

}
