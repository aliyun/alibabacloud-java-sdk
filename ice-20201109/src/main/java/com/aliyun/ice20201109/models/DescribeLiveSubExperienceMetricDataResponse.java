// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLiveSubExperienceMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveSubExperienceMetricDataResponseBody body;

    public static DescribeLiveSubExperienceMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSubExperienceMetricDataResponse self = new DescribeLiveSubExperienceMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSubExperienceMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveSubExperienceMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveSubExperienceMetricDataResponse setBody(DescribeLiveSubExperienceMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveSubExperienceMetricDataResponseBody getBody() {
        return this.body;
    }

}
