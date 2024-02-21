// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeExecErrorStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetQueryOptimizeExecErrorStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueryOptimizeExecErrorStatsResponse setBody(GetQueryOptimizeExecErrorStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryOptimizeExecErrorStatsResponseBody getBody() {
        return this.body;
    }

}
