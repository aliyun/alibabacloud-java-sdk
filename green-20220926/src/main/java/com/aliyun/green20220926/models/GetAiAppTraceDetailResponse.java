// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppTraceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiAppTraceDetailResponseBody body;

    public static GetAiAppTraceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppTraceDetailResponse self = new GetAiAppTraceDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetAiAppTraceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiAppTraceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiAppTraceDetailResponse setBody(GetAiAppTraceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiAppTraceDetailResponseBody getBody() {
        return this.body;
    }

}
