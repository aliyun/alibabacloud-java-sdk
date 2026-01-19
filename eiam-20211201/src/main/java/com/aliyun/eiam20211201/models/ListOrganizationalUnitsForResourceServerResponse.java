// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsForResourceServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOrganizationalUnitsForResourceServerResponseBody body;

    public static ListOrganizationalUnitsForResourceServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitsForResourceServerResponse self = new ListOrganizationalUnitsForResourceServerResponse();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitsForResourceServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrganizationalUnitsForResourceServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOrganizationalUnitsForResourceServerResponse setBody(ListOrganizationalUnitsForResourceServerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrganizationalUnitsForResourceServerResponseBody getBody() {
        return this.body;
    }

}
