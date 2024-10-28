// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class RebuildEdgeContainerAppStagingEnvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebuildEdgeContainerAppStagingEnvResponseBody body;

    public static RebuildEdgeContainerAppStagingEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        RebuildEdgeContainerAppStagingEnvResponse self = new RebuildEdgeContainerAppStagingEnvResponse();
        return TeaModel.build(map, self);
    }

    public RebuildEdgeContainerAppStagingEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebuildEdgeContainerAppStagingEnvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebuildEdgeContainerAppStagingEnvResponse setBody(RebuildEdgeContainerAppStagingEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public RebuildEdgeContainerAppStagingEnvResponseBody getBody() {
        return this.body;
    }

}
