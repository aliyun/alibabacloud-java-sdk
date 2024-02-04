// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetFigureClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFigureClusterResponseBody body;

    public static GetFigureClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFigureClusterResponse self = new GetFigureClusterResponse();
        return TeaModel.build(map, self);
    }

    public GetFigureClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFigureClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFigureClusterResponse setBody(GetFigureClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFigureClusterResponseBody getBody() {
        return this.body;
    }

}
