// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiLatencyDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiLatencyDataResponseBody body;

    public static DescribeApiLatencyDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiLatencyDataResponse self = new DescribeApiLatencyDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiLatencyDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiLatencyDataResponse setBody(DescribeApiLatencyDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiLatencyDataResponseBody getBody() {
        return this.body;
    }

}
