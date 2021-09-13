// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.assettech20190930.models;

import com.aliyun.tea.*;

public class ListIssueSymbolRoutingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIssueSymbolRoutingPolicyResponseBody body;

    public static ListIssueSymbolRoutingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIssueSymbolRoutingPolicyResponse self = new ListIssueSymbolRoutingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ListIssueSymbolRoutingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIssueSymbolRoutingPolicyResponse setBody(ListIssueSymbolRoutingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIssueSymbolRoutingPolicyResponseBody getBody() {
        return this.body;
    }

}
