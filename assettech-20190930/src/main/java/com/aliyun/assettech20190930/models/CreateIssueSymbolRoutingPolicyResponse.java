// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.assettech20190930.models;

import com.aliyun.tea.*;

public class CreateIssueSymbolRoutingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIssueSymbolRoutingPolicyResponseBody body;

    public static CreateIssueSymbolRoutingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIssueSymbolRoutingPolicyResponse self = new CreateIssueSymbolRoutingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateIssueSymbolRoutingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIssueSymbolRoutingPolicyResponse setBody(CreateIssueSymbolRoutingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIssueSymbolRoutingPolicyResponseBody getBody() {
        return this.body;
    }

}
