// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdatePerformanceDataCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePerformanceDataCollectionResponseBody body;

    public static UpdatePerformanceDataCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePerformanceDataCollectionResponse self = new UpdatePerformanceDataCollectionResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePerformanceDataCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePerformanceDataCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePerformanceDataCollectionResponse setBody(UpdatePerformanceDataCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePerformanceDataCollectionResponseBody getBody() {
        return this.body;
    }

}
