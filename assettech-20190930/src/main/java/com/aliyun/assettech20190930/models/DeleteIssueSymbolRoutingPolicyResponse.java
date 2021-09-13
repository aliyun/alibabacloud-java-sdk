// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.assettech20190930.models;

import com.aliyun.tea.*;

public class DeleteIssueSymbolRoutingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIssueSymbolRoutingPolicyResponseBody body;

    public static DeleteIssueSymbolRoutingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIssueSymbolRoutingPolicyResponse self = new DeleteIssueSymbolRoutingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIssueSymbolRoutingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIssueSymbolRoutingPolicyResponse setBody(DeleteIssueSymbolRoutingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIssueSymbolRoutingPolicyResponseBody getBody() {
        return this.body;
    }

}
