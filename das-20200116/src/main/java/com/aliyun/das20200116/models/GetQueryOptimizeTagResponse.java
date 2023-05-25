// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetQueryOptimizeTagResponseBody body;

    public static GetQueryOptimizeTagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeTagResponse self = new GetQueryOptimizeTagResponse();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueryOptimizeTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueryOptimizeTagResponse setBody(GetQueryOptimizeTagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryOptimizeTagResponseBody getBody() {
        return this.body;
    }

}
