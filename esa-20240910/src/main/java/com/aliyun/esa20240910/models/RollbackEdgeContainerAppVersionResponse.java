// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class RollbackEdgeContainerAppVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackEdgeContainerAppVersionResponseBody body;

    public static RollbackEdgeContainerAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackEdgeContainerAppVersionResponse self = new RollbackEdgeContainerAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public RollbackEdgeContainerAppVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackEdgeContainerAppVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackEdgeContainerAppVersionResponse setBody(RollbackEdgeContainerAppVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackEdgeContainerAppVersionResponseBody getBody() {
        return this.body;
    }

}
