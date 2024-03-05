// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeGWSClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGWSClustersResponseBody body;

    public static DescribeGWSClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGWSClustersResponse self = new DescribeGWSClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGWSClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGWSClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGWSClustersResponse setBody(DescribeGWSClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGWSClustersResponseBody getBody() {
        return this.body;
    }

}
