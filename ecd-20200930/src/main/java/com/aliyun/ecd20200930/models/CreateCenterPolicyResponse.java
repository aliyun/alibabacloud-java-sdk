// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCenterPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCenterPolicyResponseBody body;

    public static CreateCenterPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCenterPolicyResponse self = new CreateCenterPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateCenterPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCenterPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCenterPolicyResponse setBody(CreateCenterPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCenterPolicyResponseBody getBody() {
        return this.body;
    }

}
