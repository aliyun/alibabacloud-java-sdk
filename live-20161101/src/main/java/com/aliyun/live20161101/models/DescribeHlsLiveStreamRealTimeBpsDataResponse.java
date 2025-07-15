// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeHlsLiveStreamRealTimeBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHlsLiveStreamRealTimeBpsDataResponseBody body;

    public static DescribeHlsLiveStreamRealTimeBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHlsLiveStreamRealTimeBpsDataResponse self = new DescribeHlsLiveStreamRealTimeBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHlsLiveStreamRealTimeBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHlsLiveStreamRealTimeBpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHlsLiveStreamRealTimeBpsDataResponse setBody(DescribeHlsLiveStreamRealTimeBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHlsLiveStreamRealTimeBpsDataResponseBody getBody() {
        return this.body;
    }

}
