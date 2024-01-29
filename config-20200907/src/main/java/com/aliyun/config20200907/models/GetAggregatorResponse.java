// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAggregatorResponseBody body;

    public static GetAggregatorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregatorResponse self = new GetAggregatorResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregatorResponse setBody(GetAggregatorResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregatorResponseBody getBody() {
        return this.body;
    }

}
