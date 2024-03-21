// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnWafPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDcdnWafPolicyResponseBody body;

    public static CreateDcdnWafPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnWafPolicyResponse self = new CreateDcdnWafPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateDcdnWafPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDcdnWafPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDcdnWafPolicyResponse setBody(CreateDcdnWafPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDcdnWafPolicyResponseBody getBody() {
        return this.body;
    }

}
