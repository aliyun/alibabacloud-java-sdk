// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamPushMetricDetailDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveStreamPushMetricDetailDataResponseBody body;

    public static DescribeLiveStreamPushMetricDetailDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamPushMetricDetailDataResponse self = new DescribeLiveStreamPushMetricDetailDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamPushMetricDetailDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamPushMetricDetailDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamPushMetricDetailDataResponse setBody(DescribeLiveStreamPushMetricDetailDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamPushMetricDetailDataResponseBody getBody() {
        return this.body;
    }

}
