// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumComputeMetricsByRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SumComputeMetricsByRecordResponseBody body;

    public static SumComputeMetricsByRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        SumComputeMetricsByRecordResponse self = new SumComputeMetricsByRecordResponse();
        return TeaModel.build(map, self);
    }

    public SumComputeMetricsByRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SumComputeMetricsByRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SumComputeMetricsByRecordResponse setBody(SumComputeMetricsByRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public SumComputeMetricsByRecordResponseBody getBody() {
        return this.body;
    }

}
