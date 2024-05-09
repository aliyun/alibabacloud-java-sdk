// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainApplyRefundResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainApplyRefundResponseBody body;

    public static TrainApplyRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainApplyRefundResponse self = new TrainApplyRefundResponse();
        return TeaModel.build(map, self);
    }

    public TrainApplyRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainApplyRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainApplyRefundResponse setBody(TrainApplyRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainApplyRefundResponseBody getBody() {
        return this.body;
    }

}
