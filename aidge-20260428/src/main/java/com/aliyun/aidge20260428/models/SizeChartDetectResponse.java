// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class SizeChartDetectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SizeChartDetectResponseBody body;

    public static SizeChartDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        SizeChartDetectResponse self = new SizeChartDetectResponse();
        return TeaModel.build(map, self);
    }

    public SizeChartDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SizeChartDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SizeChartDetectResponse setBody(SizeChartDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public SizeChartDetectResponseBody getBody() {
        return this.body;
    }

}
