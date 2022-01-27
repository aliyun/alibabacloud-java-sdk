// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeExecErrorSampleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetQueryOptimizeExecErrorSampleResponse setBody(GetQueryOptimizeExecErrorSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryOptimizeExecErrorSampleResponseBody getBody() {
        return this.body;
    }

}
