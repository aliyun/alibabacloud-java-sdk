// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class SizeChartExtractAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SizeChartExtractAsyncResponseBody body;

    public static SizeChartExtractAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        SizeChartExtractAsyncResponse self = new SizeChartExtractAsyncResponse();
        return TeaModel.build(map, self);
    }

    public SizeChartExtractAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SizeChartExtractAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SizeChartExtractAsyncResponse setBody(SizeChartExtractAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public SizeChartExtractAsyncResponseBody getBody() {
        return this.body;
    }

}
