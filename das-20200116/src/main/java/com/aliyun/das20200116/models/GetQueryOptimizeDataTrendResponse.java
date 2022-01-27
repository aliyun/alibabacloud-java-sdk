// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeDataTrendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetQueryOptimizeDataTrendResponseBody body;

    public static GetQueryOptimizeDataTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeDataTrendResponse self = new GetQueryOptimizeDataTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeDataTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueryOptimizeDataTrendResponse setBody(GetQueryOptimizeDataTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryOptimizeDataTrendResponseBody getBody() {
        return this.body;
    }

}
