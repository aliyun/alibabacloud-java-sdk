// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RevokeApplicationFromOrganizationalUnitsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeApplicationFromOrganizationalUnitsResponseBody body;

    public static RevokeApplicationFromOrganizationalUnitsResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeApplicationFromOrganizationalUnitsResponse self = new RevokeApplicationFromOrganizationalUnitsResponse();
        return TeaModel.build(map, self);
    }

    public RevokeApplicationFromOrganizationalUnitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeApplicationFromOrganizationalUnitsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeApplicationFromOrganizationalUnitsResponse setBody(RevokeApplicationFromOrganizationalUnitsResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeApplicationFromOrganizationalUnitsResponseBody getBody() {
        return this.body;
    }

}
