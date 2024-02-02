// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class BindEnterpriseSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindEnterpriseSnapshotPolicyResponseBody body;

    public static BindEnterpriseSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        BindEnterpriseSnapshotPolicyResponse self = new BindEnterpriseSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public BindEnterpriseSnapshotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindEnterpriseSnapshotPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindEnterpriseSnapshotPolicyResponse setBody(BindEnterpriseSnapshotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public BindEnterpriseSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

}
