// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetGwpBenchmarkListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGwpBenchmarkListResponseBody body;

    public static GetGwpBenchmarkListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGwpBenchmarkListResponse self = new GetGwpBenchmarkListResponse();
        return TeaModel.build(map, self);
    }

    public GetGwpBenchmarkListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGwpBenchmarkListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGwpBenchmarkListResponse setBody(GetGwpBenchmarkListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGwpBenchmarkListResponseBody getBody() {
        return this.body;
    }

}
