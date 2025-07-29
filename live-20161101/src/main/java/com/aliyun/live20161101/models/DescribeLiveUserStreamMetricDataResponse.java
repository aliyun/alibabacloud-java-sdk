// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserStreamMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveUserStreamMetricDataResponseBody body;

    public static DescribeLiveUserStreamMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserStreamMetricDataResponse self = new DescribeLiveUserStreamMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserStreamMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveUserStreamMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveUserStreamMetricDataResponse setBody(DescribeLiveUserStreamMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveUserStreamMetricDataResponseBody getBody() {
        return this.body;
    }

}
