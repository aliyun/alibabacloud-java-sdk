// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamTranscodeMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveStreamTranscodeMetricDataResponseBody body;

    public static DescribeLiveStreamTranscodeMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamTranscodeMetricDataResponse self = new DescribeLiveStreamTranscodeMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamTranscodeMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamTranscodeMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamTranscodeMetricDataResponse setBody(DescribeLiveStreamTranscodeMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamTranscodeMetricDataResponseBody getBody() {
        return this.body;
    }

}
