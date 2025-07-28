// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPolicyAssociationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAutoSnapshotPolicyAssociationsResponseBody body;

    public static DescribeAutoSnapshotPolicyAssociationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotPolicyAssociationsResponse self = new DescribeAutoSnapshotPolicyAssociationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotPolicyAssociationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoSnapshotPolicyAssociationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoSnapshotPolicyAssociationsResponse setBody(DescribeAutoSnapshotPolicyAssociationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoSnapshotPolicyAssociationsResponseBody getBody() {
        return this.body;
    }

}
