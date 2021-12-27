// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class OpenVClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenVClusterResponseBody body;

    public static OpenVClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenVClusterResponse self = new OpenVClusterResponse();
        return TeaModel.build(map, self);
    }

    public OpenVClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenVClusterResponse setBody(OpenVClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenVClusterResponseBody getBody() {
        return this.body;
    }

}
