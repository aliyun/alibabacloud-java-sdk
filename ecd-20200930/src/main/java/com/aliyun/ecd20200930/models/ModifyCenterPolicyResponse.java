// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCenterPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCenterPolicyResponseBody body;

    public static ModifyCenterPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCenterPolicyResponse self = new ModifyCenterPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCenterPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCenterPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCenterPolicyResponse setBody(ModifyCenterPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCenterPolicyResponseBody getBody() {
        return this.body;
    }

}
