// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RemoveUserFromOrganizationalUnitsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveUserFromOrganizationalUnitsResponseBody body;

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

    public RemoveUserFromOrganizationalUnitsResponse setBody(RemoveUserFromOrganizationalUnitsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUserFromOrganizationalUnitsResponseBody getBody() {
        return this.body;
    }

}
