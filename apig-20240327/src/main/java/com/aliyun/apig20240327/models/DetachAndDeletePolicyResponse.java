// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DetachAndDeletePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachAndDeletePolicyResponseBody body;

    public static DetachAndDeletePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachAndDeletePolicyResponse self = new DetachAndDeletePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DetachAndDeletePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachAndDeletePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachAndDeletePolicyResponse setBody(DetachAndDeletePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachAndDeletePolicyResponseBody getBody() {
        return this.body;
    }

}
