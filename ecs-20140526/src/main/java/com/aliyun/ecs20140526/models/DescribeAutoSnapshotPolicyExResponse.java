// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPolicyExResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAutoSnapshotPolicyExResponse setBody(DescribeAutoSnapshotPolicyExResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoSnapshotPolicyExResponseBody getBody() {
        return this.body;
    }

}
