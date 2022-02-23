// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ScaleUpClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScaleUpClusterResponseBody body;

    public static ScaleUpClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleUpClusterResponse self = new ScaleUpClusterResponse();
        return TeaModel.build(map, self);
    }

    public ScaleUpClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleUpClusterResponse setBody(ScaleUpClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleUpClusterResponseBody getBody() {
        return this.body;
    }

}
