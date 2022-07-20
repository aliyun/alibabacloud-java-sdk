// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLivePubMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLivePubMetricDataResponseBody body;

    public static DescribeLivePubMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePubMetricDataResponse self = new DescribeLivePubMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLivePubMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLivePubMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLivePubMetricDataResponse setBody(DescribeLivePubMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLivePubMetricDataResponseBody getBody() {
        return this.body;
    }

}
