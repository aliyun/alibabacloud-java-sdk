// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateEnterpriseAcceleratePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEnterpriseAcceleratePolicyResponseBody body;

    public static CreateEnterpriseAcceleratePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseAcceleratePolicyResponse self = new CreateEnterpriseAcceleratePolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseAcceleratePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnterpriseAcceleratePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEnterpriseAcceleratePolicyResponse setBody(CreateEnterpriseAcceleratePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnterpriseAcceleratePolicyResponseBody getBody() {
        return this.body;
    }

}
