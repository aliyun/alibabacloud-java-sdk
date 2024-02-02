// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeInstanceMessageRoutingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeInstanceMessageRoutingResponseBody body;

    public static GetEdgeInstanceMessageRoutingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeInstanceMessageRoutingResponse self = new GetEdgeInstanceMessageRoutingResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeInstanceMessageRoutingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeInstanceMessageRoutingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeInstanceMessageRoutingResponse setBody(GetEdgeInstanceMessageRoutingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeInstanceMessageRoutingResponseBody getBody() {
        return this.body;
    }

}
