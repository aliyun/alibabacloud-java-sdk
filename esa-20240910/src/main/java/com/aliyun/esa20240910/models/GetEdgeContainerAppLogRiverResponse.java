// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppLogRiverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeContainerAppLogRiverResponseBody body;

    public static GetEdgeContainerAppLogRiverResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppLogRiverResponse self = new GetEdgeContainerAppLogRiverResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppLogRiverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeContainerAppLogRiverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeContainerAppLogRiverResponse setBody(GetEdgeContainerAppLogRiverResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeContainerAppLogRiverResponseBody getBody() {
        return this.body;
    }

}
