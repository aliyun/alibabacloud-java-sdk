// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateInstanceEndpointAclPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateInstanceEndpointAclPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceEndpointAclPolicyResponse setBody(CreateInstanceEndpointAclPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceEndpointAclPolicyResponseBody getBody() {
        return this.body;
    }

}
