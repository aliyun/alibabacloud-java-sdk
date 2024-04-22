// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DetachClusterFromHubResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DetachClusterFromHubResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachClusterFromHubResponse setBody(DetachClusterFromHubResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachClusterFromHubResponseBody getBody() {
        return this.body;
    }

}
