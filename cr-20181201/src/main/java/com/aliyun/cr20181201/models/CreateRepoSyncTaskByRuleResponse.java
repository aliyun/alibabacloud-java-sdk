// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncTaskByRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRepoSyncTaskByRuleResponseBody body;

    public static CreateRepoSyncTaskByRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoSyncTaskByRuleResponse self = new CreateRepoSyncTaskByRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateRepoSyncTaskByRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRepoSyncTaskByRuleResponse setBody(CreateRepoSyncTaskByRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepoSyncTaskByRuleResponseBody getBody() {
        return this.body;
    }

}
