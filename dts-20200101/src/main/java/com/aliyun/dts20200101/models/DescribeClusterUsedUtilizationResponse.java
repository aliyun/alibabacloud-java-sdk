// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeClusterUsedUtilizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterUsedUtilizationResponseBody body;

    public static DescribeClusterUsedUtilizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterUsedUtilizationResponse self = new DescribeClusterUsedUtilizationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterUsedUtilizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterUsedUtilizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterUsedUtilizationResponse setBody(DescribeClusterUsedUtilizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterUsedUtilizationResponseBody getBody() {
        return this.body;
    }

}
