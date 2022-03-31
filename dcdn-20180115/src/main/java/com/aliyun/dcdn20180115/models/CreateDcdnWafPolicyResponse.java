// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnWafPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateDcdnWafPolicyResponse setBody(CreateDcdnWafPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDcdnWafPolicyResponseBody getBody() {
        return this.body;
    }

}
