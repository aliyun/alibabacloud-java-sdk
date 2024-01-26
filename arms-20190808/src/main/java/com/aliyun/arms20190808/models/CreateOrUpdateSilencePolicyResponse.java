// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSilencePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOrUpdateSilencePolicyResponseBody body;

    public static CreateOrUpdateSilencePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSilencePolicyResponse self = new CreateOrUpdateSilencePolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSilencePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateSilencePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrUpdateSilencePolicyResponse setBody(CreateOrUpdateSilencePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateSilencePolicyResponseBody getBody() {
        return this.body;
    }

}
