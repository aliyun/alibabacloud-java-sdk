// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ClearEdgeInstanceDriverConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearEdgeInstanceDriverConfigsResponseBody body;

    public static ClearEdgeInstanceDriverConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearEdgeInstanceDriverConfigsResponse self = new ClearEdgeInstanceDriverConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ClearEdgeInstanceDriverConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearEdgeInstanceDriverConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearEdgeInstanceDriverConfigsResponse setBody(ClearEdgeInstanceDriverConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearEdgeInstanceDriverConfigsResponseBody getBody() {
        return this.body;
    }

}
