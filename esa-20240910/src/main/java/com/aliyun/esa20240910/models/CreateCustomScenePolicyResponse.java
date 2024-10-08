// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateCustomScenePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomScenePolicyResponseBody body;

    public static CreateCustomScenePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomScenePolicyResponse self = new CreateCustomScenePolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomScenePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomScenePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomScenePolicyResponse setBody(CreateCustomScenePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomScenePolicyResponseBody getBody() {
        return this.body;
    }

}
