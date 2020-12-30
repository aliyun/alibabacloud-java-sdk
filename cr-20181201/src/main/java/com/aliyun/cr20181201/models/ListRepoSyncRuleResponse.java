// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoSyncRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRepoSyncRuleResponseBody body;

    public static ListRepoSyncRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepoSyncRuleResponse self = new ListRepoSyncRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListRepoSyncRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepoSyncRuleResponse setBody(ListRepoSyncRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepoSyncRuleResponseBody getBody() {
        return this.body;
    }

}
