// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOrganizationResponseBody body;

    public static CreateOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrganizationResponse self = new CreateOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrganizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrganizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrganizationResponse setBody(CreateOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrganizationResponseBody getBody() {
        return this.body;
    }

}
