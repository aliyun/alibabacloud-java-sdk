// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class WakeUpClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WakeUpClusterResponseBody body;

    public static WakeUpClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        WakeUpClusterResponse self = new WakeUpClusterResponse();
        return TeaModel.build(map, self);
    }

    public WakeUpClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WakeUpClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WakeUpClusterResponse setBody(WakeUpClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public WakeUpClusterResponseBody getBody() {
        return this.body;
    }

}
