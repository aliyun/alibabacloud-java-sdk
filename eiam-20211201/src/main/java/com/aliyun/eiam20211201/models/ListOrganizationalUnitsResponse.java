// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOrganizationalUnitsResponseBody body;

    public static ListOrganizationalUnitsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitsResponse self = new ListOrganizationalUnitsResponse();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrganizationalUnitsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOrganizationalUnitsResponse setBody(ListOrganizationalUnitsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrganizationalUnitsResponseBody getBody() {
        return this.body;
    }

}
