// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteInstanceEndpointAclPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteInstanceEndpointAclPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstanceEndpointAclPolicyResponse setBody(DeleteInstanceEndpointAclPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceEndpointAclPolicyResponseBody getBody() {
        return this.body;
    }

}
