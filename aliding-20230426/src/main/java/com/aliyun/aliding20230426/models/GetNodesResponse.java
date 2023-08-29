// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetNodesResponseBody body;

    public static GetNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodesResponse self = new GetNodesResponse();
        return TeaModel.build(map, self);
    }

    public GetNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNodesResponse setBody(GetNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodesResponseBody getBody() {
        return this.body;
    }

}
