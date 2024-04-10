// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateInstanceEndpointStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceEndpointStatusResponseBody body;

    public static UpdateInstanceEndpointStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceEndpointStatusResponse self = new UpdateInstanceEndpointStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceEndpointStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceEndpointStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceEndpointStatusResponse setBody(UpdateInstanceEndpointStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceEndpointStatusResponseBody getBody() {
        return this.body;
    }

}
