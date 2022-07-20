// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLivePubExperienceMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLivePubExperienceMetricDataResponseBody body;

    public static DescribeLivePubExperienceMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePubExperienceMetricDataResponse self = new DescribeLivePubExperienceMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLivePubExperienceMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLivePubExperienceMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLivePubExperienceMetricDataResponse setBody(DescribeLivePubExperienceMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLivePubExperienceMetricDataResponseBody getBody() {
        return this.body;
    }

}
