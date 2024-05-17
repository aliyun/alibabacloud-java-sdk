// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeStreamingDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStreamingDataSourceResponseBody body;

    public static DescribeStreamingDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamingDataSourceResponse self = new DescribeStreamingDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStreamingDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStreamingDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStreamingDataSourceResponse setBody(DescribeStreamingDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStreamingDataSourceResponseBody getBody() {
        return this.body;
    }

}
