// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class UpdateLifecyclePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLifecyclePolicyResponseBody body;

    public static UpdateLifecyclePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLifecyclePolicyResponse self = new UpdateLifecyclePolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLifecyclePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLifecyclePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLifecyclePolicyResponse setBody(UpdateLifecyclePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLifecyclePolicyResponseBody getBody() {
        return this.body;
    }

}
