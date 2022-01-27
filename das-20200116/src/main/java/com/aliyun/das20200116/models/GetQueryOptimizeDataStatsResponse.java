// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeDataStatsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetQueryOptimizeDataStatsResponse setBody(GetQueryOptimizeDataStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryOptimizeDataStatsResponseBody getBody() {
        return this.body;
    }

}
