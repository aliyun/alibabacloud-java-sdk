// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHubClustersResponseBody body;

    public static DescribeHubClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHubClustersResponse self = new DescribeHubClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHubClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHubClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHubClustersResponse setBody(DescribeHubClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHubClustersResponseBody getBody() {
        return this.body;
    }

}
