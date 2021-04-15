// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ScalingClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScalingClusterResponseBody body;

    public static ScalingClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ScalingClusterResponse self = new ScalingClusterResponse();
        return TeaModel.build(map, self);
    }

    public ScalingClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScalingClusterResponse setBody(ScalingClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ScalingClusterResponseBody getBody() {
        return this.body;
    }

}
