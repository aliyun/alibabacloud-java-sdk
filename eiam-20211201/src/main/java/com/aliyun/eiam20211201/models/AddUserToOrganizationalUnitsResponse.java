// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AddUserToOrganizationalUnitsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddUserToOrganizationalUnitsResponseBody body;

    public static AddUserToOrganizationalUnitsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserToOrganizationalUnitsResponse self = new AddUserToOrganizationalUnitsResponse();
        return TeaModel.build(map, self);
    }

    public AddUserToOrganizationalUnitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserToOrganizationalUnitsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserToOrganizationalUnitsResponse setBody(AddUserToOrganizationalUnitsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserToOrganizationalUnitsResponseBody getBody() {
        return this.body;
    }

}
