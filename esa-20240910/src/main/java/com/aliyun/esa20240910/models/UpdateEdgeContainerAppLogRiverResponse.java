// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateEdgeContainerAppLogRiverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEdgeContainerAppLogRiverResponseBody body;

    public static UpdateEdgeContainerAppLogRiverResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeContainerAppLogRiverResponse self = new UpdateEdgeContainerAppLogRiverResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeContainerAppLogRiverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEdgeContainerAppLogRiverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEdgeContainerAppLogRiverResponse setBody(UpdateEdgeContainerAppLogRiverResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEdgeContainerAppLogRiverResponseBody getBody() {
        return this.body;
    }

}
