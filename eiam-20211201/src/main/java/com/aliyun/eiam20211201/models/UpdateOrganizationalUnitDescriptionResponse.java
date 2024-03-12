// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateOrganizationalUnitDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOrganizationalUnitDescriptionResponseBody body;

    public static UpdateOrganizationalUnitDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrganizationalUnitDescriptionResponse self = new UpdateOrganizationalUnitDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOrganizationalUnitDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOrganizationalUnitDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOrganizationalUnitDescriptionResponse setBody(UpdateOrganizationalUnitDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOrganizationalUnitDescriptionResponseBody getBody() {
        return this.body;
    }

}
