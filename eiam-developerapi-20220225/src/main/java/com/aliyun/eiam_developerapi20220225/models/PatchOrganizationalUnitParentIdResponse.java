// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class PatchOrganizationalUnitParentIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    public static PatchOrganizationalUnitParentIdResponse build(java.util.Map<String, ?> map) throws Exception {
        PatchOrganizationalUnitParentIdResponse self = new PatchOrganizationalUnitParentIdResponse();
        return TeaModel.build(map, self);
    }

    public PatchOrganizationalUnitParentIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PatchOrganizationalUnitParentIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
