// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateAclPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAclPolicyResponseBody body;

    public static CreateAclPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAclPolicyResponse self = new CreateAclPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAclPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAclPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAclPolicyResponse setBody(CreateAclPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAclPolicyResponseBody getBody() {
        return this.body;
    }

}
