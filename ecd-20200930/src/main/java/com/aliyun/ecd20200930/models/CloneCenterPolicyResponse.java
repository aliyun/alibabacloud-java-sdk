// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CloneCenterPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloneCenterPolicyResponseBody body;

    public static CloneCenterPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneCenterPolicyResponse self = new CloneCenterPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CloneCenterPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneCenterPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneCenterPolicyResponse setBody(CloneCenterPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneCenterPolicyResponseBody getBody() {
        return this.body;
    }

}
