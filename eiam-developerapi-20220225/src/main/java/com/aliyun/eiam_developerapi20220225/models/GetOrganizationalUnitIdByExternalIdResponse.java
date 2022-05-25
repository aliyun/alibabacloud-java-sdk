// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetOrganizationalUnitIdByExternalIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOrganizationalUnitIdByExternalIdResponseBody body;

    public static GetOrganizationalUnitIdByExternalIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationalUnitIdByExternalIdResponse self = new GetOrganizationalUnitIdByExternalIdResponse();
        return TeaModel.build(map, self);
    }

    public GetOrganizationalUnitIdByExternalIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrganizationalUnitIdByExternalIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrganizationalUnitIdByExternalIdResponse setBody(GetOrganizationalUnitIdByExternalIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrganizationalUnitIdByExternalIdResponseBody getBody() {
        return this.body;
    }

}
