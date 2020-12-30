// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteInstanceEndpointAclPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInstanceEndpointAclPolicyResponseBody body;

    public static DeleteInstanceEndpointAclPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceEndpointAclPolicyResponse self = new DeleteInstanceEndpointAclPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceEndpointAclPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceEndpointAclPolicyResponse setBody(DeleteInstanceEndpointAclPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceEndpointAclPolicyResponseBody getBody() {
        return this.body;
    }

}
