// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RestartClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestartClusterResponseBody body;

    public static RestartClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartClusterResponse self = new RestartClusterResponse();
        return TeaModel.build(map, self);
    }

    public RestartClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartClusterResponse setBody(RestartClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartClusterResponseBody getBody() {
        return this.body;
    }

}
