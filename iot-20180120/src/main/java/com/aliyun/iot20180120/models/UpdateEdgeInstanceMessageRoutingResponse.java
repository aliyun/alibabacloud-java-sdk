// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateEdgeInstanceMessageRoutingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEdgeInstanceMessageRoutingResponseBody body;

    public static UpdateEdgeInstanceMessageRoutingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeInstanceMessageRoutingResponse self = new UpdateEdgeInstanceMessageRoutingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeInstanceMessageRoutingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEdgeInstanceMessageRoutingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEdgeInstanceMessageRoutingResponse setBody(UpdateEdgeInstanceMessageRoutingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEdgeInstanceMessageRoutingResponseBody getBody() {
        return this.body;
    }

}
