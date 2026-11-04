// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CommitContactFlowVersionModificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CommitContactFlowVersionModificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CommitContactFlowVersionModificationResponse setBody(CommitContactFlowVersionModificationResponseBody body) {
        this.body = body;
        return this;
    }
    public CommitContactFlowVersionModificationResponseBody getBody() {
        return this.body;
    }

}
