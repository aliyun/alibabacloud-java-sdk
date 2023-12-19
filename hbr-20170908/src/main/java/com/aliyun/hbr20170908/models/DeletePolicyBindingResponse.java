// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeletePolicyBindingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePolicyBindingResponseBody body;

    public static DeletePolicyBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyBindingResponse self = new DeletePolicyBindingResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolicyBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolicyBindingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolicyBindingResponse setBody(DeletePolicyBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolicyBindingResponseBody getBody() {
        return this.body;
    }

}
