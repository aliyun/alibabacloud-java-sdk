// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListGovernanceIssueTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGovernanceIssueTablesResponseBody body;

    public static ListGovernanceIssueTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGovernanceIssueTablesResponse self = new ListGovernanceIssueTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListGovernanceIssueTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGovernanceIssueTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGovernanceIssueTablesResponse setBody(ListGovernanceIssueTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGovernanceIssueTablesResponseBody getBody() {
        return this.body;
    }

}
