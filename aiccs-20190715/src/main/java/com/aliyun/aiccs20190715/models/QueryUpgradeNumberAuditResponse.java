// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryUpgradeNumberAuditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUpgradeNumberAuditResponseBody body;

    public static QueryUpgradeNumberAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUpgradeNumberAuditResponse self = new QueryUpgradeNumberAuditResponse();
        return TeaModel.build(map, self);
    }

    public QueryUpgradeNumberAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUpgradeNumberAuditResponse setBody(QueryUpgradeNumberAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUpgradeNumberAuditResponseBody getBody() {
        return this.body;
    }

}
