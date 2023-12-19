// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdatePolicyBindingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePolicyBindingResponseBody body;

    public static UpdatePolicyBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyBindingResponse self = new UpdatePolicyBindingResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePolicyBindingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePolicyBindingResponse setBody(UpdatePolicyBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePolicyBindingResponseBody getBody() {
        return this.body;
    }

}
