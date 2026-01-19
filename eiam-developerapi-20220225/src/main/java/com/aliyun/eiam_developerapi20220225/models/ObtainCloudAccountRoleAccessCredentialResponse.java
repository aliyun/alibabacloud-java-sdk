// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ObtainCloudAccountRoleAccessCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ObtainCloudAccountRoleAccessCredentialResponseBody body;

    public static ObtainCloudAccountRoleAccessCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        ObtainCloudAccountRoleAccessCredentialResponse self = new ObtainCloudAccountRoleAccessCredentialResponse();
        return TeaModel.build(map, self);
    }

    public ObtainCloudAccountRoleAccessCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ObtainCloudAccountRoleAccessCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ObtainCloudAccountRoleAccessCredentialResponse setBody(ObtainCloudAccountRoleAccessCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public ObtainCloudAccountRoleAccessCredentialResponseBody getBody() {
        return this.body;
    }

}
