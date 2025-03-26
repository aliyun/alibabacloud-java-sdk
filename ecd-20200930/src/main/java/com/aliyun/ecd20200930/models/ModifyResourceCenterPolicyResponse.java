// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyResourceCenterPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyResourceCenterPolicyResponseBody body;

    public static ModifyResourceCenterPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceCenterPolicyResponse self = new ModifyResourceCenterPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyResourceCenterPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyResourceCenterPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyResourceCenterPolicyResponse setBody(ModifyResourceCenterPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyResourceCenterPolicyResponseBody getBody() {
        return this.body;
    }

}
