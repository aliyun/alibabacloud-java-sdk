// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteAclPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAclPolicyResponseBody body;

    public static DeleteAclPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAclPolicyResponse self = new DeleteAclPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAclPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAclPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAclPolicyResponse setBody(DeleteAclPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAclPolicyResponseBody getBody() {
        return this.body;
    }

}
