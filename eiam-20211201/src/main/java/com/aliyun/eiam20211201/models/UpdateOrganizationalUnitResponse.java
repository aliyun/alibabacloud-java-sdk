// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateOrganizationalUnitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOrganizationalUnitResponseBody body;

    public static UpdateOrganizationalUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrganizationalUnitResponse self = new UpdateOrganizationalUnitResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOrganizationalUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOrganizationalUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOrganizationalUnitResponse setBody(UpdateOrganizationalUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOrganizationalUnitResponseBody getBody() {
        return this.body;
    }

}
