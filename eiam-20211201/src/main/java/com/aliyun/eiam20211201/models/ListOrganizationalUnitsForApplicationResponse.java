// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsForApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOrganizationalUnitsForApplicationResponseBody body;

    public static ListOrganizationalUnitsForApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitsForApplicationResponse self = new ListOrganizationalUnitsForApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitsForApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrganizationalUnitsForApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOrganizationalUnitsForApplicationResponse setBody(ListOrganizationalUnitsForApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrganizationalUnitsForApplicationResponseBody getBody() {
        return this.body;
    }

}
