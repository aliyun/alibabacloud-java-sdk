// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateIntegrationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIntegrationPolicyResponseBody body;

    public static UpdateIntegrationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntegrationPolicyResponse self = new UpdateIntegrationPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIntegrationPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIntegrationPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIntegrationPolicyResponse setBody(UpdateIntegrationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIntegrationPolicyResponseBody getBody() {
        return this.body;
    }

}
