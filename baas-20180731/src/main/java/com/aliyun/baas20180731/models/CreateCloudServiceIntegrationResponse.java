// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateCloudServiceIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudServiceIntegrationResponseBody body;

    public static CreateCloudServiceIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudServiceIntegrationResponse self = new CreateCloudServiceIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudServiceIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudServiceIntegrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudServiceIntegrationResponse setBody(CreateCloudServiceIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudServiceIntegrationResponseBody getBody() {
        return this.body;
    }

}
