// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeStreamingDataServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStreamingDataServiceResponseBody body;

    public static DescribeStreamingDataServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamingDataServiceResponse self = new DescribeStreamingDataServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStreamingDataServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStreamingDataServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStreamingDataServiceResponse setBody(DescribeStreamingDataServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStreamingDataServiceResponseBody getBody() {
        return this.body;
    }

}
