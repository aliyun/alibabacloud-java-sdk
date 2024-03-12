// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForOrganizationalUnitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationsForOrganizationalUnitResponseBody body;

    public static ListApplicationsForOrganizationalUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForOrganizationalUnitResponse self = new ListApplicationsForOrganizationalUnitResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForOrganizationalUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationsForOrganizationalUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationsForOrganizationalUnitResponse setBody(ListApplicationsForOrganizationalUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationsForOrganizationalUnitResponseBody getBody() {
        return this.body;
    }

}
