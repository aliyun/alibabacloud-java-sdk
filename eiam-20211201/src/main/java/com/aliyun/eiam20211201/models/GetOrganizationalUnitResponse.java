// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetOrganizationalUnitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOrganizationalUnitResponseBody body;

    public static GetOrganizationalUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationalUnitResponse self = new GetOrganizationalUnitResponse();
        return TeaModel.build(map, self);
    }

    public GetOrganizationalUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrganizationalUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrganizationalUnitResponse setBody(GetOrganizationalUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrganizationalUnitResponseBody getBody() {
        return this.body;
    }

}
