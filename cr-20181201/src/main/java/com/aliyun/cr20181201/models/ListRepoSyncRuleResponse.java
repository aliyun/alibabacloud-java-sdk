// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoSyncRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListRepoSyncRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepoSyncRuleResponse setBody(ListRepoSyncRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepoSyncRuleResponseBody getBody() {
        return this.body;
    }

}
