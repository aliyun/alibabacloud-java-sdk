// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiGroupNetworkPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApiGroupNetworkPolicyResponseBody body;

    public static ModifyApiGroupNetworkPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiGroupNetworkPolicyResponse self = new ModifyApiGroupNetworkPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApiGroupNetworkPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApiGroupNetworkPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApiGroupNetworkPolicyResponse setBody(ModifyApiGroupNetworkPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApiGroupNetworkPolicyResponseBody getBody() {
        return this.body;
    }

}
