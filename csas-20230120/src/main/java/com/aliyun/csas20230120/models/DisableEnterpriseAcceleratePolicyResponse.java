// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DisableEnterpriseAcceleratePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableEnterpriseAcceleratePolicyResponseBody body;

    public static DisableEnterpriseAcceleratePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableEnterpriseAcceleratePolicyResponse self = new DisableEnterpriseAcceleratePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DisableEnterpriseAcceleratePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableEnterpriseAcceleratePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableEnterpriseAcceleratePolicyResponse setBody(DisableEnterpriseAcceleratePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableEnterpriseAcceleratePolicyResponseBody getBody() {
        return this.body;
    }

}
