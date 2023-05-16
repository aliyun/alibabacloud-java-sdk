// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class RemoveUserFromOrganizationalUnitsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    public static RemoveUserFromOrganizationalUnitsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromOrganizationalUnitsResponse self = new RemoveUserFromOrganizationalUnitsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromOrganizationalUnitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUserFromOrganizationalUnitsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
