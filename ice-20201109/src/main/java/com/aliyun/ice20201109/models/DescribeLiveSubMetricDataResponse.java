// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLiveSubMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveSubMetricDataResponseBody body;

    public static DescribeLiveSubMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSubMetricDataResponse self = new DescribeLiveSubMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSubMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveSubMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveSubMetricDataResponse setBody(DescribeLiveSubMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveSubMetricDataResponseBody getBody() {
        return this.body;
    }

}
