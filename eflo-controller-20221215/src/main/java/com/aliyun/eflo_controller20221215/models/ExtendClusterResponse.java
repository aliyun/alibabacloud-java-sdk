// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ExtendClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExtendClusterResponseBody body;

    public static ExtendClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtendClusterResponse self = new ExtendClusterResponse();
        return TeaModel.build(map, self);
    }

    public ExtendClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExtendClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExtendClusterResponse setBody(ExtendClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ExtendClusterResponseBody getBody() {
        return this.body;
    }

}
