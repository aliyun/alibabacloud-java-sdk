// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveInteractionMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveInteractionMetricDataResponseBody body;

    public static DescribeLiveInteractionMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveInteractionMetricDataResponse self = new DescribeLiveInteractionMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveInteractionMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveInteractionMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveInteractionMetricDataResponse setBody(DescribeLiveInteractionMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveInteractionMetricDataResponseBody getBody() {
        return this.body;
    }

}
