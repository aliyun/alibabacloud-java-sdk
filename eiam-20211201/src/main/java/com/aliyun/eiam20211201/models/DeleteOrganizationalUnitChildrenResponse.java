// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteOrganizationalUnitChildrenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOrganizationalUnitChildrenResponseBody body;

    public static DeleteOrganizationalUnitChildrenResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOrganizationalUnitChildrenResponse self = new DeleteOrganizationalUnitChildrenResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOrganizationalUnitChildrenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOrganizationalUnitChildrenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOrganizationalUnitChildrenResponse setBody(DeleteOrganizationalUnitChildrenResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOrganizationalUnitChildrenResponseBody getBody() {
        return this.body;
    }

}
