// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainFeeCalculateRefundResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainFeeCalculateRefundResponseBody body;

    public static TrainFeeCalculateRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainFeeCalculateRefundResponse self = new TrainFeeCalculateRefundResponse();
        return TeaModel.build(map, self);
    }

    public TrainFeeCalculateRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainFeeCalculateRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainFeeCalculateRefundResponse setBody(TrainFeeCalculateRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainFeeCalculateRefundResponseBody getBody() {
        return this.body;
    }

}
