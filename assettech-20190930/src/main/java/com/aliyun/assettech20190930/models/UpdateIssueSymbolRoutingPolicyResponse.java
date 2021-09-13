// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.assettech20190930.models;

import com.aliyun.tea.*;

public class UpdateIssueSymbolRoutingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIssueSymbolRoutingPolicyResponseBody body;

    public static UpdateIssueSymbolRoutingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIssueSymbolRoutingPolicyResponse self = new UpdateIssueSymbolRoutingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIssueSymbolRoutingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIssueSymbolRoutingPolicyResponse setBody(UpdateIssueSymbolRoutingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIssueSymbolRoutingPolicyResponseBody getBody() {
        return this.body;
    }

}
