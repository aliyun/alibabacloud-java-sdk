// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRtcRecordUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveRtcRecordUsageDataResponseBody body;

    public static DescribeLiveRtcRecordUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRtcRecordUsageDataResponse self = new DescribeLiveRtcRecordUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRtcRecordUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveRtcRecordUsageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveRtcRecordUsageDataResponse setBody(DescribeLiveRtcRecordUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveRtcRecordUsageDataResponseBody getBody() {
        return this.body;
    }

}
