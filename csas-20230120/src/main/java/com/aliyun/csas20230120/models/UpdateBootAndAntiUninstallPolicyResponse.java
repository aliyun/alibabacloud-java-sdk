// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateBootAndAntiUninstallPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBootAndAntiUninstallPolicyResponseBody body;

    public static UpdateBootAndAntiUninstallPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBootAndAntiUninstallPolicyResponse self = new UpdateBootAndAntiUninstallPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBootAndAntiUninstallPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBootAndAntiUninstallPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBootAndAntiUninstallPolicyResponse setBody(UpdateBootAndAntiUninstallPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBootAndAntiUninstallPolicyResponseBody getBody() {
        return this.body;
    }

}
