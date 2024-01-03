// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeEnterpriseSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEnterpriseSnapshotPolicyResponseBody body;

    public static DescribeEnterpriseSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnterpriseSnapshotPolicyResponse self = new DescribeEnterpriseSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnterpriseSnapshotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnterpriseSnapshotPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnterpriseSnapshotPolicyResponse setBody(DescribeEnterpriseSnapshotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnterpriseSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

}
