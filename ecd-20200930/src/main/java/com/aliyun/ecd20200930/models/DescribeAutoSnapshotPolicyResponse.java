// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAutoSnapshotPolicyResponseBody body;

    public static DescribeAutoSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotPolicyResponse self = new DescribeAutoSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoSnapshotPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoSnapshotPolicyResponse setBody(DescribeAutoSnapshotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

}
