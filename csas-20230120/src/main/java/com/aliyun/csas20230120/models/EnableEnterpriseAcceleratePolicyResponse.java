// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class EnableEnterpriseAcceleratePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableEnterpriseAcceleratePolicyResponseBody body;

    public static EnableEnterpriseAcceleratePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableEnterpriseAcceleratePolicyResponse self = new EnableEnterpriseAcceleratePolicyResponse();
        return TeaModel.build(map, self);
    }

    public EnableEnterpriseAcceleratePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableEnterpriseAcceleratePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableEnterpriseAcceleratePolicyResponse setBody(EnableEnterpriseAcceleratePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableEnterpriseAcceleratePolicyResponseBody getBody() {
        return this.body;
    }

}
