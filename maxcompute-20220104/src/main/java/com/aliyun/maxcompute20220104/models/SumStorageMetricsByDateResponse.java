// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumStorageMetricsByDateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SumStorageMetricsByDateResponseBody body;

    public static SumStorageMetricsByDateResponse build(java.util.Map<String, ?> map) throws Exception {
        SumStorageMetricsByDateResponse self = new SumStorageMetricsByDateResponse();
        return TeaModel.build(map, self);
    }

    public SumStorageMetricsByDateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SumStorageMetricsByDateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SumStorageMetricsByDateResponse setBody(SumStorageMetricsByDateResponseBody body) {
        this.body = body;
        return this;
    }
    public SumStorageMetricsByDateResponseBody getBody() {
        return this.body;
    }

}
