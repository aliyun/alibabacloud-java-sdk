// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetEdgeInstanceDriverConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetEdgeInstanceDriverConfigsResponseBody body;

    public static SetEdgeInstanceDriverConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetEdgeInstanceDriverConfigsResponse self = new SetEdgeInstanceDriverConfigsResponse();
        return TeaModel.build(map, self);
    }

    public SetEdgeInstanceDriverConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetEdgeInstanceDriverConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetEdgeInstanceDriverConfigsResponse setBody(SetEdgeInstanceDriverConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetEdgeInstanceDriverConfigsResponseBody getBody() {
        return this.body;
    }

}
