// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitParentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOrganizationalUnitParentsResponseBody body;

    public static ListOrganizationalUnitParentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitParentsResponse self = new ListOrganizationalUnitParentsResponse();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitParentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrganizationalUnitParentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOrganizationalUnitParentsResponse setBody(ListOrganizationalUnitParentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrganizationalUnitParentsResponseBody getBody() {
        return this.body;
    }

}
