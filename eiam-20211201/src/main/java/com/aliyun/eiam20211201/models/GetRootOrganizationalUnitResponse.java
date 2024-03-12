// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetRootOrganizationalUnitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRootOrganizationalUnitResponseBody body;

    public static GetRootOrganizationalUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRootOrganizationalUnitResponse self = new GetRootOrganizationalUnitResponse();
        return TeaModel.build(map, self);
    }

    public GetRootOrganizationalUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRootOrganizationalUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRootOrganizationalUnitResponse setBody(GetRootOrganizationalUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRootOrganizationalUnitResponseBody getBody() {
        return this.body;
    }

}
