// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class SizeChartExtractResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SizeChartExtractResponseBody body;

    public static SizeChartExtractResponse build(java.util.Map<String, ?> map) throws Exception {
        SizeChartExtractResponse self = new SizeChartExtractResponse();
        return TeaModel.build(map, self);
    }

    public SizeChartExtractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SizeChartExtractResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SizeChartExtractResponse setBody(SizeChartExtractResponseBody body) {
        this.body = body;
        return this;
    }
    public SizeChartExtractResponseBody getBody() {
        return this.body;
    }

}
