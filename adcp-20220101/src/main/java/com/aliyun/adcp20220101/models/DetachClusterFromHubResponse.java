// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DetachClusterFromHubResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachClusterFromHubResponseBody body;

    public static DetachClusterFromHubResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachClusterFromHubResponse self = new DetachClusterFromHubResponse();
        return TeaModel.build(map, self);
    }

    public DetachClusterFromHubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachClusterFromHubResponse setBody(DetachClusterFromHubResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachClusterFromHubResponseBody getBody() {
        return this.body;
    }

}
