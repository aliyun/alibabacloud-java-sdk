// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateCloudIntegrationServiceTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudIntegrationServiceTokenResponseBody body;

    public static CreateCloudIntegrationServiceTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudIntegrationServiceTokenResponse self = new CreateCloudIntegrationServiceTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudIntegrationServiceTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudIntegrationServiceTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudIntegrationServiceTokenResponse setBody(CreateCloudIntegrationServiceTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudIntegrationServiceTokenResponseBody getBody() {
        return this.body;
    }

}
