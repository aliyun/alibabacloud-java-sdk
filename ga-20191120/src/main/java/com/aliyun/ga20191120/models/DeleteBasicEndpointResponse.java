// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBasicEndpointResponseBody body;

    public static DeleteBasicEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicEndpointResponse self = new DeleteBasicEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBasicEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBasicEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBasicEndpointResponse setBody(DeleteBasicEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBasicEndpointResponseBody getBody() {
        return this.body;
    }

}
