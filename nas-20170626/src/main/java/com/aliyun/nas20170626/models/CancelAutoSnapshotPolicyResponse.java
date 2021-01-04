// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelAutoSnapshotPolicyResponseBody body;

    public static CancelAutoSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAutoSnapshotPolicyResponse self = new CancelAutoSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CancelAutoSnapshotPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAutoSnapshotPolicyResponse setBody(CancelAutoSnapshotPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAutoSnapshotPolicyResponseBody getBody() {
        return this.body;
    }

}
