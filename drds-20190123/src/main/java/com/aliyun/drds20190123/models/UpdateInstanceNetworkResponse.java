// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpdateInstanceNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateInstanceNetworkResponse setBody(UpdateInstanceNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceNetworkResponseBody getBody() {
        return this.body;
    }

}
