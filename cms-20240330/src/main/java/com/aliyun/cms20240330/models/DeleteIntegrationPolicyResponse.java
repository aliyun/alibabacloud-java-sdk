// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteIntegrationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIntegrationPolicyResponseBody body;

    public static DeleteIntegrationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntegrationPolicyResponse self = new DeleteIntegrationPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIntegrationPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIntegrationPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIntegrationPolicyResponse setBody(DeleteIntegrationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIntegrationPolicyResponseBody getBody() {
        return this.body;
    }

}
