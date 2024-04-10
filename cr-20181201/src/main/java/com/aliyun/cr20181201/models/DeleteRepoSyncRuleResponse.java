// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteRepoSyncRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRepoSyncRuleResponseBody body;

    public static DeleteRepoSyncRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepoSyncRuleResponse self = new DeleteRepoSyncRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRepoSyncRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRepoSyncRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRepoSyncRuleResponse setBody(DeleteRepoSyncRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepoSyncRuleResponseBody getBody() {
        return this.body;
    }

}
