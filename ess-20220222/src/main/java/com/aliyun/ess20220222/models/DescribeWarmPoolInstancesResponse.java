// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeWarmPoolInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWarmPoolInstancesResponseBody body;

    public static DescribeWarmPoolInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWarmPoolInstancesResponse self = new DescribeWarmPoolInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWarmPoolInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWarmPoolInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWarmPoolInstancesResponse setBody(DescribeWarmPoolInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWarmPoolInstancesResponseBody getBody() {
        return this.body;
    }

}
