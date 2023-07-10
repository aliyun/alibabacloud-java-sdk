// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateNetworkAccessEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNetworkAccessEndpointResponseBody body;

    public static CreateNetworkAccessEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkAccessEndpointResponse self = new CreateNetworkAccessEndpointResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkAccessEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkAccessEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNetworkAccessEndpointResponse setBody(CreateNetworkAccessEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkAccessEndpointResponseBody getBody() {
        return this.body;
    }

}
