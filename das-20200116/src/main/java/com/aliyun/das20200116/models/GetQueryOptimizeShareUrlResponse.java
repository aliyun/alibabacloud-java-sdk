// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeShareUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQueryOptimizeShareUrlResponseBody body;

    public static GetQueryOptimizeShareUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeShareUrlResponse self = new GetQueryOptimizeShareUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeShareUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueryOptimizeShareUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueryOptimizeShareUrlResponse setBody(GetQueryOptimizeShareUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryOptimizeShareUrlResponseBody getBody() {
        return this.body;
    }

}
