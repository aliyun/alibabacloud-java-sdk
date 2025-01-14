// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetBootAndAntiUninstallPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBootAndAntiUninstallPolicyResponseBody body;

    public static GetBootAndAntiUninstallPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBootAndAntiUninstallPolicyResponse self = new GetBootAndAntiUninstallPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetBootAndAntiUninstallPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBootAndAntiUninstallPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBootAndAntiUninstallPolicyResponse setBody(GetBootAndAntiUninstallPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBootAndAntiUninstallPolicyResponseBody getBody() {
        return this.body;
    }

}
