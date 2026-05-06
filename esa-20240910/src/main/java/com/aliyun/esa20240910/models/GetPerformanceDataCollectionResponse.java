// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetPerformanceDataCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPerformanceDataCollectionResponseBody body;

    public static GetPerformanceDataCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPerformanceDataCollectionResponse self = new GetPerformanceDataCollectionResponse();
        return TeaModel.build(map, self);
    }

    public GetPerformanceDataCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPerformanceDataCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPerformanceDataCollectionResponse setBody(GetPerformanceDataCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPerformanceDataCollectionResponseBody getBody() {
        return this.body;
    }

}
