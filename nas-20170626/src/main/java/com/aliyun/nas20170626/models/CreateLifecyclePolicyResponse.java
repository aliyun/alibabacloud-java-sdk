// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLifecyclePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLifecyclePolicyResponseBody body;

    public static CreateLifecyclePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLifecyclePolicyResponse self = new CreateLifecyclePolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateLifecyclePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLifecyclePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLifecyclePolicyResponse setBody(CreateLifecyclePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLifecyclePolicyResponseBody getBody() {
        return this.body;
    }

}
