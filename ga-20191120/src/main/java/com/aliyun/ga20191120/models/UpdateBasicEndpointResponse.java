// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBasicEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBasicEndpointResponseBody body;

    public static UpdateBasicEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBasicEndpointResponse self = new UpdateBasicEndpointResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBasicEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBasicEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBasicEndpointResponse setBody(UpdateBasicEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBasicEndpointResponseBody getBody() {
        return this.body;
    }

}
