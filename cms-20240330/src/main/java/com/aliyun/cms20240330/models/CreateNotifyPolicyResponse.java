// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateNotifyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNotifyPolicyResponseBody body;

    public static CreateNotifyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNotifyPolicyResponse self = new CreateNotifyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateNotifyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNotifyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNotifyPolicyResponse setBody(CreateNotifyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNotifyPolicyResponseBody getBody() {
        return this.body;
    }

}
