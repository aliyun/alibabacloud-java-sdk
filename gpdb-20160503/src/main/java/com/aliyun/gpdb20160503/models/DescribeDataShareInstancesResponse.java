// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataShareInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataShareInstancesResponseBody body;

    public static DescribeDataShareInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataShareInstancesResponse self = new DescribeDataShareInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataShareInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataShareInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataShareInstancesResponse setBody(DescribeDataShareInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataShareInstancesResponseBody getBody() {
        return this.body;
    }

}
