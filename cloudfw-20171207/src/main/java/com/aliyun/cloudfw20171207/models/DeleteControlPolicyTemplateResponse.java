// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteControlPolicyTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteControlPolicyTemplateResponseBody body;

    public static DeleteControlPolicyTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteControlPolicyTemplateResponse self = new DeleteControlPolicyTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteControlPolicyTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteControlPolicyTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteControlPolicyTemplateResponse setBody(DeleteControlPolicyTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteControlPolicyTemplateResponseBody getBody() {
        return this.body;
    }

}
