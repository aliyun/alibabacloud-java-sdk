// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListAgentSummaryReportsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAgentSummaryReportsResponseBody body;

    public static ListAgentSummaryReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSummaryReportsResponse self = new ListAgentSummaryReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentSummaryReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentSummaryReportsResponse setBody(ListAgentSummaryReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentSummaryReportsResponseBody getBody() {
        return this.body;
    }

}
