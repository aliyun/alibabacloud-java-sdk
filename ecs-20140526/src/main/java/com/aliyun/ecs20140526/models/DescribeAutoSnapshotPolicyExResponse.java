// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPolicyExResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAutoSnapshotPolicyExResponseBody body;

    public static DescribeAutoSnapshotPolicyExResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotPolicyExResponse self = new DescribeAutoSnapshotPolicyExResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotPolicyExResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoSnapshotPolicyExResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoSnapshotPolicyExResponse setBody(DescribeAutoSnapshotPolicyExResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoSnapshotPolicyExResponseBody getBody() {
        return this.body;
    }

}
