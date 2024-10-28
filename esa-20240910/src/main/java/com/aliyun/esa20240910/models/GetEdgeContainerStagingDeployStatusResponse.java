// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerStagingDeployStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeContainerStagingDeployStatusResponseBody body;

    public static GetEdgeContainerStagingDeployStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerStagingDeployStatusResponse self = new GetEdgeContainerStagingDeployStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerStagingDeployStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeContainerStagingDeployStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeContainerStagingDeployStatusResponse setBody(GetEdgeContainerStagingDeployStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeContainerStagingDeployStatusResponseBody getBody() {
        return this.body;
    }

}
