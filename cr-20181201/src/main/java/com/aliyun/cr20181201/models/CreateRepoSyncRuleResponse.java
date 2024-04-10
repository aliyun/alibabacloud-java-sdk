// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRepoSyncRuleResponseBody body;

    public static CreateRepoSyncRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoSyncRuleResponse self = new CreateRepoSyncRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateRepoSyncRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRepoSyncRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRepoSyncRuleResponse setBody(CreateRepoSyncRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepoSyncRuleResponseBody getBody() {
        return this.body;
    }

}
