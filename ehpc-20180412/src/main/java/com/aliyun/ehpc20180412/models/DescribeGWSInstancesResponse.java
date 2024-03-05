// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeGWSInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGWSInstancesResponseBody body;

    public static DescribeGWSInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGWSInstancesResponse self = new DescribeGWSInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGWSInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGWSInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGWSInstancesResponse setBody(DescribeGWSInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGWSInstancesResponseBody getBody() {
        return this.body;
    }

}
