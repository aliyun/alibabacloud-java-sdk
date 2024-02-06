// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class OpenVClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public OpenVClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenVClusterResponse setBody(OpenVClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenVClusterResponseBody getBody() {
        return this.body;
    }

}
