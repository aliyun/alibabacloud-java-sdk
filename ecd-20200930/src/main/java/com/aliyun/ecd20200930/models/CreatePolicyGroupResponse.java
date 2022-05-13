// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreatePolicyGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePolicyGroupResponseBody body;

    public static CreatePolicyGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyGroupResponse self = new CreatePolicyGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolicyGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePolicyGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePolicyGroupResponse setBody(CreatePolicyGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePolicyGroupResponseBody getBody() {
        return this.body;
    }

}
