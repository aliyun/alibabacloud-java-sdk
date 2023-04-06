// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateOrganizationalUnitParentIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOrganizationalUnitParentIdResponseBody body;

    public static UpdateOrganizationalUnitParentIdResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrganizationalUnitParentIdResponse self = new UpdateOrganizationalUnitParentIdResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOrganizationalUnitParentIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOrganizationalUnitParentIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOrganizationalUnitParentIdResponse setBody(UpdateOrganizationalUnitParentIdResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOrganizationalUnitParentIdResponseBody getBody() {
        return this.body;
    }

}
