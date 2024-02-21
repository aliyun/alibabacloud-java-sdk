// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillPredictionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnUserBillPredictionResponseBody body;

    public static DescribeCdnUserBillPredictionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserBillPredictionResponse self = new DescribeCdnUserBillPredictionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserBillPredictionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnUserBillPredictionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnUserBillPredictionResponse setBody(DescribeCdnUserBillPredictionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnUserBillPredictionResponseBody getBody() {
        return this.body;
    }

}
