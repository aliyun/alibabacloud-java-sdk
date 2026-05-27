// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumStorageMetricsByTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SumStorageMetricsByTypeResponseBody body;

    public static SumStorageMetricsByTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        SumStorageMetricsByTypeResponse self = new SumStorageMetricsByTypeResponse();
        return TeaModel.build(map, self);
    }

    public SumStorageMetricsByTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SumStorageMetricsByTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SumStorageMetricsByTypeResponse setBody(SumStorageMetricsByTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public SumStorageMetricsByTypeResponseBody getBody() {
        return this.body;
    }

}
