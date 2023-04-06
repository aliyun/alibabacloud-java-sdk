// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteOrganizationalUnitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOrganizationalUnitResponseBody body;

    public static DeleteOrganizationalUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOrganizationalUnitResponse self = new DeleteOrganizationalUnitResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOrganizationalUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOrganizationalUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOrganizationalUnitResponse setBody(DeleteOrganizationalUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOrganizationalUnitResponseBody getBody() {
        return this.body;
    }

}
