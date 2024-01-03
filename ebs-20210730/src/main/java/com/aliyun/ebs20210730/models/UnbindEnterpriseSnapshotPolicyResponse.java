// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class UnbindEnterpriseSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindEnterpriseSnapshotPolicyResponseBody body;

    public static UnbindEnterpriseSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindEnterpriseSnapshotPolicyResponse self = new UnbindEnterpriseSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UnbindEnterpriseSnapshotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindEnterpriseSnapshotPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindEnterpriseSnapshotPolicyResponse setBody(UnbindEnterpriseSnapshotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindEnterpriseSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

}
