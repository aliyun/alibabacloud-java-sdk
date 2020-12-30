// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateInstanceEndpointAclPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInstanceEndpointAclPolicyResponseBody body;

    public static CreateInstanceEndpointAclPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceEndpointAclPolicyResponse self = new CreateInstanceEndpointAclPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceEndpointAclPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceEndpointAclPolicyResponse setBody(CreateInstanceEndpointAclPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceEndpointAclPolicyResponseBody getBody() {
        return this.body;
    }

}
