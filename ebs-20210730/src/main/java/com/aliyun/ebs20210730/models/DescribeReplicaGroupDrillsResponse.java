// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeReplicaGroupDrillsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeReplicaGroupDrillsResponseBody body;

    public static DescribeReplicaGroupDrillsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicaGroupDrillsResponse self = new DescribeReplicaGroupDrillsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReplicaGroupDrillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReplicaGroupDrillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReplicaGroupDrillsResponse setBody(DescribeReplicaGroupDrillsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReplicaGroupDrillsResponseBody getBody() {
        return this.body;
    }

}
