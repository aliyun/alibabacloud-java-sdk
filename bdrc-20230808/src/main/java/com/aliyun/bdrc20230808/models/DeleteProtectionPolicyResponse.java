// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DeleteProtectionPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProtectionPolicyResponseBody body;

    public static DeleteProtectionPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProtectionPolicyResponse self = new DeleteProtectionPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProtectionPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProtectionPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProtectionPolicyResponse setBody(DeleteProtectionPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProtectionPolicyResponseBody getBody() {
        return this.body;
    }

}
