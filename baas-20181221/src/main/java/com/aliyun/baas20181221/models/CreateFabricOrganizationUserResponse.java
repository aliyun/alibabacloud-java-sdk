// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricOrganizationUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateFabricOrganizationUserResponse setBody(CreateFabricOrganizationUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFabricOrganizationUserResponseBody getBody() {
        return this.body;
    }

}
