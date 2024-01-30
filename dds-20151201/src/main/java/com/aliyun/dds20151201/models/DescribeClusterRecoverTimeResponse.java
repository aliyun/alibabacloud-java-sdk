// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeClusterRecoverTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterRecoverTimeResponseBody body;

    public static DescribeClusterRecoverTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterRecoverTimeResponse self = new DescribeClusterRecoverTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterRecoverTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterRecoverTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterRecoverTimeResponse setBody(DescribeClusterRecoverTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterRecoverTimeResponseBody getBody() {
        return this.body;
    }

}
