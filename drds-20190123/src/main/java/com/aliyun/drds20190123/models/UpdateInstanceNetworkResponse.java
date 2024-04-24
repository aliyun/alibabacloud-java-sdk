// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpdateInstanceNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceNetworkResponseBody body;

    public static UpdateInstanceNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceNetworkResponse self = new UpdateInstanceNetworkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceNetworkResponse setBody(UpdateInstanceNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceNetworkResponseBody getBody() {
        return this.body;
    }

}
