// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeSolutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetQueryOptimizeSolutionResponseBody body;

    public static GetQueryOptimizeSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeSolutionResponse self = new GetQueryOptimizeSolutionResponse();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeSolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueryOptimizeSolutionResponse setBody(GetQueryOptimizeSolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryOptimizeSolutionResponseBody getBody() {
        return this.body;
    }

}
