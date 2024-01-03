// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEnterpriseSnapshotPolicyResponseBody body;

    public static DeleteEnterpriseSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseSnapshotPolicyResponse self = new DeleteEnterpriseSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseSnapshotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnterpriseSnapshotPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEnterpriseSnapshotPolicyResponse setBody(DeleteEnterpriseSnapshotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnterpriseSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

}
