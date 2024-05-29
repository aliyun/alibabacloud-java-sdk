// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceClusterListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceClusterListResponseBody body;

    public static DescribeInstanceClusterListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceClusterListResponse self = new DescribeInstanceClusterListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceClusterListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceClusterListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceClusterListResponse setBody(DescribeInstanceClusterListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceClusterListResponseBody getBody() {
        return this.body;
    }

}
