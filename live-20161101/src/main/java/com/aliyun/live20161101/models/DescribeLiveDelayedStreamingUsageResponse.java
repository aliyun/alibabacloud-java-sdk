// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDelayedStreamingUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDelayedStreamingUsageResponseBody body;

    public static DescribeLiveDelayedStreamingUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDelayedStreamingUsageResponse self = new DescribeLiveDelayedStreamingUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDelayedStreamingUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDelayedStreamingUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDelayedStreamingUsageResponse setBody(DescribeLiveDelayedStreamingUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDelayedStreamingUsageResponseBody getBody() {
        return this.body;
    }

}
