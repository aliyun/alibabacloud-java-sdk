// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiLatencyDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeApiLatencyDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiLatencyDataResponse setBody(DescribeApiLatencyDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiLatencyDataResponseBody getBody() {
        return this.body;
    }

}
