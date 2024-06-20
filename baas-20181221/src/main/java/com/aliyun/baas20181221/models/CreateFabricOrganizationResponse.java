// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFabricOrganizationResponseBody body;

    public static CreateFabricOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricOrganizationResponse self = new CreateFabricOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public CreateFabricOrganizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFabricOrganizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFabricOrganizationResponse setBody(CreateFabricOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFabricOrganizationResponseBody getBody() {
        return this.body;
    }

}
