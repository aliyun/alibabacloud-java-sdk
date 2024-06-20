// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricOrganizationUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFabricOrganizationUserResponseBody body;

    public static CreateFabricOrganizationUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricOrganizationUserResponse self = new CreateFabricOrganizationUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateFabricOrganizationUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFabricOrganizationUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFabricOrganizationUserResponse setBody(CreateFabricOrganizationUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFabricOrganizationUserResponseBody getBody() {
        return this.body;
    }

}
