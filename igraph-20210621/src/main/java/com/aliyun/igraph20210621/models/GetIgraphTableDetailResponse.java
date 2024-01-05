// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class GetIgraphTableDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIgraphTableDetailResponseBody body;

    public static GetIgraphTableDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIgraphTableDetailResponse self = new GetIgraphTableDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetIgraphTableDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIgraphTableDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIgraphTableDetailResponse setBody(GetIgraphTableDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIgraphTableDetailResponseBody getBody() {
        return this.body;
    }

}
