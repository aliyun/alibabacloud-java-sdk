// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeInstanceMessageRoutingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEdgeInstanceMessageRoutingResponseBody body;

    public static CreateEdgeInstanceMessageRoutingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeInstanceMessageRoutingResponse self = new CreateEdgeInstanceMessageRoutingResponse();
        return TeaModel.build(map, self);
    }

    public CreateEdgeInstanceMessageRoutingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEdgeInstanceMessageRoutingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEdgeInstanceMessageRoutingResponse setBody(CreateEdgeInstanceMessageRoutingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeInstanceMessageRoutingResponseBody getBody() {
        return this.body;
    }

}
