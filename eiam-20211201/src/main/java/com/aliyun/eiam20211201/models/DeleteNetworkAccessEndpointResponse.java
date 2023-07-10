// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteNetworkAccessEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNetworkAccessEndpointResponseBody body;

    public static DeleteNetworkAccessEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkAccessEndpointResponse self = new DeleteNetworkAccessEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkAccessEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkAccessEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkAccessEndpointResponse setBody(DeleteNetworkAccessEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkAccessEndpointResponseBody getBody() {
        return this.body;
    }

}
