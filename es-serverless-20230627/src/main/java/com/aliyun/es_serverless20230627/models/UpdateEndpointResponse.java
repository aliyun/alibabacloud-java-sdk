// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdateEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEndpointResponseBody body;

    public static UpdateEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEndpointResponse self = new UpdateEndpointResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEndpointResponse setBody(UpdateEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEndpointResponseBody getBody() {
        return this.body;
    }

}
