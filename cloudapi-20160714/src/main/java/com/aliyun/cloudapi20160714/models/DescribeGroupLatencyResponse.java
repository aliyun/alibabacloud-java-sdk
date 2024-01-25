// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeGroupLatencyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGroupLatencyResponseBody body;

    public static DescribeGroupLatencyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupLatencyResponse self = new DescribeGroupLatencyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupLatencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupLatencyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupLatencyResponse setBody(DescribeGroupLatencyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupLatencyResponseBody getBody() {
        return this.body;
    }

}
