// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody body;

    public static CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponse self = new CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponse();
        return TeaModel.build(map, self);
    }

    public CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponse setBody(CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody getBody() {
        return this.body;
    }

}
