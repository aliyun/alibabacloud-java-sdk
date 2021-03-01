// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SubmitStructSyncOrderApprovalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitStructSyncOrderApprovalResponseBody body;

    public static SubmitStructSyncOrderApprovalResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitStructSyncOrderApprovalResponse self = new SubmitStructSyncOrderApprovalResponse();
        return TeaModel.build(map, self);
    }

    public SubmitStructSyncOrderApprovalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitStructSyncOrderApprovalResponse setBody(SubmitStructSyncOrderApprovalResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitStructSyncOrderApprovalResponseBody getBody() {
        return this.body;
    }

}
