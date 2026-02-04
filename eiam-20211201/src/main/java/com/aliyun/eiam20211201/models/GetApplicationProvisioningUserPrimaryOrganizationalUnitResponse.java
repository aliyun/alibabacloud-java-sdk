// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationProvisioningUserPrimaryOrganizationalUnitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody body;

    public static GetApplicationProvisioningUserPrimaryOrganizationalUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationProvisioningUserPrimaryOrganizationalUnitResponse self = new GetApplicationProvisioningUserPrimaryOrganizationalUnitResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationProvisioningUserPrimaryOrganizationalUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationProvisioningUserPrimaryOrganizationalUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationProvisioningUserPrimaryOrganizationalUnitResponse setBody(GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody getBody() {
        return this.body;
    }

}
