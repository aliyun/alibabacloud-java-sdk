// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeInstanceMessageRoutingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetEdgeInstanceMessageRoutingResponse setBody(GetEdgeInstanceMessageRoutingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeInstanceMessageRoutingResponseBody getBody() {
        return this.body;
    }

}
