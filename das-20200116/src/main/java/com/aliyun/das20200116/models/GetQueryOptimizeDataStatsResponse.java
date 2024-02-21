// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeDataStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQueryOptimizeDataStatsResponseBody body;

    public static GetQueryOptimizeDataStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeDataStatsResponse self = new GetQueryOptimizeDataStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeDataStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueryOptimizeDataStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueryOptimizeDataStatsResponse setBody(GetQueryOptimizeDataStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryOptimizeDataStatsResponseBody getBody() {
        return this.body;
    }

}
