// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateOrganizationUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOrganizationUserResponseBody body;

    public static CreateOrganizationUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrganizationUserResponse self = new CreateOrganizationUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrganizationUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrganizationUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrganizationUserResponse setBody(CreateOrganizationUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrganizationUserResponseBody getBody() {
        return this.body;
    }

}
