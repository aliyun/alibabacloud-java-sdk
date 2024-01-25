// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyIpControlPolicyItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyIpControlPolicyItemResponseBody body;

    public static ModifyIpControlPolicyItemResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpControlPolicyItemResponse self = new ModifyIpControlPolicyItemResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIpControlPolicyItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIpControlPolicyItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIpControlPolicyItemResponse setBody(ModifyIpControlPolicyItemResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIpControlPolicyItemResponseBody getBody() {
        return this.body;
    }

}
