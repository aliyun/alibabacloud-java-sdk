// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class UpdateProtectionPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProtectionPolicyResponseBody body;

    public static UpdateProtectionPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProtectionPolicyResponse self = new UpdateProtectionPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProtectionPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProtectionPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProtectionPolicyResponse setBody(UpdateProtectionPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProtectionPolicyResponseBody getBody() {
        return this.body;
    }

}
