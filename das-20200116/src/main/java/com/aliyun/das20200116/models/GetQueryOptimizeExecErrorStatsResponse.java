// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeExecErrorStatsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetQueryOptimizeExecErrorStatsResponseBody body;

    public static GetQueryOptimizeExecErrorStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeExecErrorStatsResponse self = new GetQueryOptimizeExecErrorStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeExecErrorStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueryOptimizeExecErrorStatsResponse setBody(GetQueryOptimizeExecErrorStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryOptimizeExecErrorStatsResponseBody getBody() {
        return this.body;
    }

}
