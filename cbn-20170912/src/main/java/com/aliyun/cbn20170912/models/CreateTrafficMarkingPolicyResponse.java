// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTrafficMarkingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTrafficMarkingPolicyResponseBody body;

    public static CreateTrafficMarkingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficMarkingPolicyResponse self = new CreateTrafficMarkingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrafficMarkingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrafficMarkingPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrafficMarkingPolicyResponse setBody(CreateTrafficMarkingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

}
