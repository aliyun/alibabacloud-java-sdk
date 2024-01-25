// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeVaultReplicationRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVaultReplicationRegionsResponseBody body;

    public static DescribeVaultReplicationRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVaultReplicationRegionsResponse self = new DescribeVaultReplicationRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVaultReplicationRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVaultReplicationRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVaultReplicationRegionsResponse setBody(DescribeVaultReplicationRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVaultReplicationRegionsResponseBody getBody() {
        return this.body;
    }

}
