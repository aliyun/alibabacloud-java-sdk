// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ModifyEnterpriseAcceleratePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEnterpriseAcceleratePolicyResponseBody body;

    public static ModifyEnterpriseAcceleratePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEnterpriseAcceleratePolicyResponse self = new ModifyEnterpriseAcceleratePolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEnterpriseAcceleratePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEnterpriseAcceleratePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEnterpriseAcceleratePolicyResponse setBody(ModifyEnterpriseAcceleratePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEnterpriseAcceleratePolicyResponseBody getBody() {
        return this.body;
    }

}
