// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class SetUserPrimaryOrganizationalUnitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

}
