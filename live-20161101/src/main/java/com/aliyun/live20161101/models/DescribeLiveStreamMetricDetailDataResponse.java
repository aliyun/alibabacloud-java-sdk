// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamMetricDetailDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamMetricDetailDataResponseBody body;

    public static DescribeLiveStreamMetricDetailDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamMetricDetailDataResponse self = new DescribeLiveStreamMetricDetailDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamMetricDetailDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamMetricDetailDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamMetricDetailDataResponse setBody(DescribeLiveStreamMetricDetailDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamMetricDetailDataResponseBody getBody() {
        return this.body;
    }

}
