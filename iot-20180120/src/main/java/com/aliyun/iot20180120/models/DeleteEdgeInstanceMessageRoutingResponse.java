// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteEdgeInstanceMessageRoutingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEdgeInstanceMessageRoutingResponseBody body;

    public static DeleteEdgeInstanceMessageRoutingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeInstanceMessageRoutingResponse self = new DeleteEdgeInstanceMessageRoutingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeInstanceMessageRoutingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEdgeInstanceMessageRoutingResponse setBody(DeleteEdgeInstanceMessageRoutingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEdgeInstanceMessageRoutingResponseBody getBody() {
        return this.body;
    }

}
