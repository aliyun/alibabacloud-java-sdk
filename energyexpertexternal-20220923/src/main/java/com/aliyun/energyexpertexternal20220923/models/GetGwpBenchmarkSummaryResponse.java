// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetGwpBenchmarkSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGwpBenchmarkSummaryResponseBody body;

    public static GetGwpBenchmarkSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGwpBenchmarkSummaryResponse self = new GetGwpBenchmarkSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetGwpBenchmarkSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGwpBenchmarkSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGwpBenchmarkSummaryResponse setBody(GetGwpBenchmarkSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGwpBenchmarkSummaryResponseBody getBody() {
        return this.body;
    }

}
