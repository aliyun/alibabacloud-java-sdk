// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ResetFabricOrganizationUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetFabricOrganizationUserPasswordResponseBody body;

    public static ResetFabricOrganizationUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetFabricOrganizationUserPasswordResponse self = new ResetFabricOrganizationUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetFabricOrganizationUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetFabricOrganizationUserPasswordResponse setBody(ResetFabricOrganizationUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetFabricOrganizationUserPasswordResponseBody getBody() {
        return this.body;
    }

}
