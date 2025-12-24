// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationProvisioningUserPrimaryOrganizationalUnitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody body;

    public static SetApplicationProvisioningUserPrimaryOrganizationalUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        SetApplicationProvisioningUserPrimaryOrganizationalUnitResponse self = new SetApplicationProvisioningUserPrimaryOrganizationalUnitResponse();
        return TeaModel.build(map, self);
    }

    public SetApplicationProvisioningUserPrimaryOrganizationalUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetApplicationProvisioningUserPrimaryOrganizationalUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetApplicationProvisioningUserPrimaryOrganizationalUnitResponse setBody(SetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public SetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody getBody() {
        return this.body;
    }

}
