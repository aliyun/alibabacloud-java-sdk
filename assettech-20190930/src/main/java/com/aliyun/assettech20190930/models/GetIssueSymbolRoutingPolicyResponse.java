// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.assettech20190930.models;

import com.aliyun.tea.*;

public class GetIssueSymbolRoutingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIssueSymbolRoutingPolicyResponseBody body;

    public static GetIssueSymbolRoutingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIssueSymbolRoutingPolicyResponse self = new GetIssueSymbolRoutingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetIssueSymbolRoutingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIssueSymbolRoutingPolicyResponse setBody(GetIssueSymbolRoutingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIssueSymbolRoutingPolicyResponseBody getBody() {
        return this.body;
    }

}
