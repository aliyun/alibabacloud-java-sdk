// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RemoveAuthPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveAuthPolicyResponseBody body;

    public static RemoveAuthPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAuthPolicyResponse self = new RemoveAuthPolicyResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAuthPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAuthPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveAuthPolicyResponse setBody(RemoveAuthPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAuthPolicyResponseBody getBody() {
        return this.body;
    }

}
