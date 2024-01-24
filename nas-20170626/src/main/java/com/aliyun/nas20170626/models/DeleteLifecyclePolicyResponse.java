// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteLifecyclePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLifecyclePolicyResponseBody body;

    public static DeleteLifecyclePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLifecyclePolicyResponse self = new DeleteLifecyclePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLifecyclePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLifecyclePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLifecyclePolicyResponse setBody(DeleteLifecyclePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLifecyclePolicyResponseBody getBody() {
        return this.body;
    }

}
