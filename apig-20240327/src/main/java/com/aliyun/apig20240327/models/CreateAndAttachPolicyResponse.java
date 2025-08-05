// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateAndAttachPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAndAttachPolicyResponseBody body;

    public static CreateAndAttachPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAndAttachPolicyResponse self = new CreateAndAttachPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAndAttachPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAndAttachPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAndAttachPolicyResponse setBody(CreateAndAttachPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAndAttachPolicyResponseBody getBody() {
        return this.body;
    }

}
