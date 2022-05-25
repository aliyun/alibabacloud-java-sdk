// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitParentIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListOrganizationalUnitParentIdsResponseBody body;

    public static ListOrganizationalUnitParentIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitParentIdsResponse self = new ListOrganizationalUnitParentIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitParentIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrganizationalUnitParentIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOrganizationalUnitParentIdsResponse setBody(ListOrganizationalUnitParentIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrganizationalUnitParentIdsResponseBody getBody() {
        return this.body;
    }

}
