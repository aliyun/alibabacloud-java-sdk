// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeRegionLatencyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRegionLatencyResponseBody body;

    public static DescribeRegionLatencyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionLatencyResponse self = new DescribeRegionLatencyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionLatencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRegionLatencyResponse setBody(DescribeRegionLatencyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRegionLatencyResponseBody getBody() {
        return this.body;
    }

}
