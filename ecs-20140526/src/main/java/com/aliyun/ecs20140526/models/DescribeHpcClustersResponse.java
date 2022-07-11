// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeHpcClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHpcClustersResponseBody body;

    public static DescribeHpcClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHpcClustersResponse self = new DescribeHpcClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHpcClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHpcClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHpcClustersResponse setBody(DescribeHpcClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHpcClustersResponseBody getBody() {
        return this.body;
    }

}
