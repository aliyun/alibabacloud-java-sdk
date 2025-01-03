// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateQosPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateQosPolicyResponseBody body;

    public static CreateQosPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQosPolicyResponse self = new CreateQosPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateQosPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQosPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQosPolicyResponse setBody(CreateQosPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQosPolicyResponseBody getBody() {
        return this.body;
    }

}
