// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeDataTopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQueryOptimizeDataTopResponseBody body;

    public static GetQueryOptimizeDataTopResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeDataTopResponse self = new GetQueryOptimizeDataTopResponse();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeDataTopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueryOptimizeDataTopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueryOptimizeDataTopResponse setBody(GetQueryOptimizeDataTopResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryOptimizeDataTopResponseBody getBody() {
        return this.body;
    }

}
