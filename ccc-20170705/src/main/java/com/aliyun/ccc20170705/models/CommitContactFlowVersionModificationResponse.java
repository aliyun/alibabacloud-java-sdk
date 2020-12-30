// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CommitContactFlowVersionModificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CommitContactFlowVersionModificationResponseBody body;

    public static CommitContactFlowVersionModificationResponse build(java.util.Map<String, ?> map) throws Exception {
        CommitContactFlowVersionModificationResponse self = new CommitContactFlowVersionModificationResponse();
        return TeaModel.build(map, self);
    }

    public CommitContactFlowVersionModificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommitContactFlowVersionModificationResponse setBody(CommitContactFlowVersionModificationResponseBody body) {
        this.body = body;
        return this;
    }
    public CommitContactFlowVersionModificationResponseBody getBody() {
        return this.body;
    }

}
