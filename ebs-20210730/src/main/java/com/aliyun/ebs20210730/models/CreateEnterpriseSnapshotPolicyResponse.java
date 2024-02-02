// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateEnterpriseSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEnterpriseSnapshotPolicyResponseBody body;

    public static CreateEnterpriseSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseSnapshotPolicyResponse self = new CreateEnterpriseSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseSnapshotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnterpriseSnapshotPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEnterpriseSnapshotPolicyResponse setBody(CreateEnterpriseSnapshotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnterpriseSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

}
