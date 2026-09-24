// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetAggregatedDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAggregatedDesktopsResponseBody body;

    public static GetAggregatedDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregatedDesktopsResponse self = new GetAggregatedDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregatedDesktopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregatedDesktopsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregatedDesktopsResponse setBody(GetAggregatedDesktopsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregatedDesktopsResponseBody getBody() {
        return this.body;
    }

}
