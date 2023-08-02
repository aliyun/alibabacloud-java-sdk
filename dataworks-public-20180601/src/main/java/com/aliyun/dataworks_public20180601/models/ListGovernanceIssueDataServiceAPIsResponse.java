// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListGovernanceIssueDataServiceAPIsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGovernanceIssueDataServiceAPIsResponseBody body;

    public static ListGovernanceIssueDataServiceAPIsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGovernanceIssueDataServiceAPIsResponse self = new ListGovernanceIssueDataServiceAPIsResponse();
        return TeaModel.build(map, self);
    }

    public ListGovernanceIssueDataServiceAPIsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGovernanceIssueDataServiceAPIsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGovernanceIssueDataServiceAPIsResponse setBody(ListGovernanceIssueDataServiceAPIsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGovernanceIssueDataServiceAPIsResponseBody getBody() {
        return this.body;
    }

}
