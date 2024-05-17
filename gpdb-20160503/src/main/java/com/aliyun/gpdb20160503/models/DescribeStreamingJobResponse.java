// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeStreamingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStreamingJobResponseBody body;

    public static DescribeStreamingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamingJobResponse self = new DescribeStreamingJobResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStreamingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStreamingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStreamingJobResponse setBody(DescribeStreamingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStreamingJobResponseBody getBody() {
        return this.body;
    }

}
