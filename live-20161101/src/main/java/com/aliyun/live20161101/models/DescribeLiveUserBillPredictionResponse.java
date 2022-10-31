// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserBillPredictionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveUserBillPredictionResponseBody body;

    public static DescribeLiveUserBillPredictionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserBillPredictionResponse self = new DescribeLiveUserBillPredictionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserBillPredictionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveUserBillPredictionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveUserBillPredictionResponse setBody(DescribeLiveUserBillPredictionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveUserBillPredictionResponseBody getBody() {
        return this.body;
    }

}
