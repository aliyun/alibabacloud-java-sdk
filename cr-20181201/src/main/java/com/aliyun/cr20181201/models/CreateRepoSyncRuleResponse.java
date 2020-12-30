// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateRepoSyncRuleResponse setBody(CreateRepoSyncRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepoSyncRuleResponseBody getBody() {
        return this.body;
    }

}
