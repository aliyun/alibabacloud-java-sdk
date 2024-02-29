// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAutoSnapshotPoliciesResponseBody body;

    public static DescribeAutoSnapshotPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotPoliciesResponse self = new DescribeAutoSnapshotPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoSnapshotPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoSnapshotPoliciesResponse setBody(DescribeAutoSnapshotPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoSnapshotPoliciesResponseBody getBody() {
        return this.body;
    }

}
