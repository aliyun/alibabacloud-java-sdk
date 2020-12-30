// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillPredictionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCdnUserBillPredictionResponse setBody(DescribeCdnUserBillPredictionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnUserBillPredictionResponseBody getBody() {
        return this.body;
    }

}
