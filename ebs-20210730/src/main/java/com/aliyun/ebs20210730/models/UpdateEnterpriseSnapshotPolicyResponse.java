// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEnterpriseSnapshotPolicyResponseBody body;

    public static UpdateEnterpriseSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnterpriseSnapshotPolicyResponse self = new UpdateEnterpriseSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnterpriseSnapshotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnterpriseSnapshotPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEnterpriseSnapshotPolicyResponse setBody(UpdateEnterpriseSnapshotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnterpriseSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

}
