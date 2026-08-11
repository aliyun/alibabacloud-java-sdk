// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class RefreshNodeGroupNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshNodeGroupNodesResponseBody body;

    public static RefreshNodeGroupNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshNodeGroupNodesResponse self = new RefreshNodeGroupNodesResponse();
        return TeaModel.build(map, self);
    }

    public RefreshNodeGroupNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshNodeGroupNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshNodeGroupNodesResponse setBody(RefreshNodeGroupNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshNodeGroupNodesResponseBody getBody() {
        return this.body;
    }

}
