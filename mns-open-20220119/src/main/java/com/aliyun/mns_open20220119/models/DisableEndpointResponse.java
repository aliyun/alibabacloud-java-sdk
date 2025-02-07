// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class DisableEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableEndpointResponseBody body;

    public static DisableEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableEndpointResponse self = new DisableEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DisableEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableEndpointResponse setBody(DisableEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableEndpointResponseBody getBody() {
        return this.body;
    }

}
