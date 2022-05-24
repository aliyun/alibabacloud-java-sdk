// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateSecurityPolicyAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSecurityPolicyAttributeResponseBody body;

    public static UpdateSecurityPolicyAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityPolicyAttributeResponse self = new UpdateSecurityPolicyAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityPolicyAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSecurityPolicyAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSecurityPolicyAttributeResponse setBody(UpdateSecurityPolicyAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSecurityPolicyAttributeResponseBody getBody() {
        return this.body;
    }

}
