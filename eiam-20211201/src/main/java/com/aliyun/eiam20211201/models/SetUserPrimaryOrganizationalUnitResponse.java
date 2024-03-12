// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetUserPrimaryOrganizationalUnitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetUserPrimaryOrganizationalUnitResponseBody body;

    public static SetUserPrimaryOrganizationalUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        SetUserPrimaryOrganizationalUnitResponse self = new SetUserPrimaryOrganizationalUnitResponse();
        return TeaModel.build(map, self);
    }

    public SetUserPrimaryOrganizationalUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetUserPrimaryOrganizationalUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetUserPrimaryOrganizationalUnitResponse setBody(SetUserPrimaryOrganizationalUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public SetUserPrimaryOrganizationalUnitResponseBody getBody() {
        return this.body;
    }

}
