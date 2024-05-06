// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudResourceStatusResponseBody body;

    public static DescribeCloudResourceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudResourceStatusResponse self = new DescribeCloudResourceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudResourceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudResourceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudResourceStatusResponse setBody(DescribeCloudResourceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudResourceStatusResponseBody getBody() {
        return this.body;
    }

}
