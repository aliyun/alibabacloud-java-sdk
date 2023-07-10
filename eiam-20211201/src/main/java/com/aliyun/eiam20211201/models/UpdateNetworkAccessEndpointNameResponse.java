// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateNetworkAccessEndpointNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateNetworkAccessEndpointNameResponseBody body;

    public static UpdateNetworkAccessEndpointNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkAccessEndpointNameResponse self = new UpdateNetworkAccessEndpointNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkAccessEndpointNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNetworkAccessEndpointNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNetworkAccessEndpointNameResponse setBody(UpdateNetworkAccessEndpointNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNetworkAccessEndpointNameResponseBody getBody() {
        return this.body;
    }

}
