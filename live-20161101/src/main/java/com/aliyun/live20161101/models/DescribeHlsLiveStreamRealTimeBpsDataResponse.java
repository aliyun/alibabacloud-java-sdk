// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeHlsLiveStreamRealTimeBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeHlsLiveStreamRealTimeBpsDataResponse setBody(DescribeHlsLiveStreamRealTimeBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHlsLiveStreamRealTimeBpsDataResponseBody getBody() {
        return this.body;
    }

}
