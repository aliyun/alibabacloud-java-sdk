// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateInstanceNetworkTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInstanceNetworkTypeResponseBody body;

    public static UpdateInstanceNetworkTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceNetworkTypeResponse self = new UpdateInstanceNetworkTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceNetworkTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceNetworkTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceNetworkTypeResponse setBody(UpdateInstanceNetworkTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceNetworkTypeResponseBody getBody() {
        return this.body;
    }

}
