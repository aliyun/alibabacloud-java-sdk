// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeExecErrorSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQueryOptimizeExecErrorSampleResponseBody body;

    public static GetQueryOptimizeExecErrorSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeExecErrorSampleResponse self = new GetQueryOptimizeExecErrorSampleResponse();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeExecErrorSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueryOptimizeExecErrorSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueryOptimizeExecErrorSampleResponse setBody(GetQueryOptimizeExecErrorSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryOptimizeExecErrorSampleResponseBody getBody() {
        return this.body;
    }

}
