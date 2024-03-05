// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeServerlessJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServerlessJobsResponseBody body;

    public static DescribeServerlessJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerlessJobsResponse self = new DescribeServerlessJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServerlessJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServerlessJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServerlessJobsResponse setBody(DescribeServerlessJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServerlessJobsResponseBody getBody() {
        return this.body;
    }

}
