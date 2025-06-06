// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseAcceleratePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEnterpriseAcceleratePolicyResponseBody body;

    public static DeleteEnterpriseAcceleratePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseAcceleratePolicyResponse self = new DeleteEnterpriseAcceleratePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseAcceleratePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnterpriseAcceleratePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEnterpriseAcceleratePolicyResponse setBody(DeleteEnterpriseAcceleratePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnterpriseAcceleratePolicyResponseBody getBody() {
        return this.body;
    }

}
