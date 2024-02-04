// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateFigureClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFigureClusterResponseBody body;

    public static UpdateFigureClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFigureClusterResponse self = new UpdateFigureClusterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFigureClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFigureClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFigureClusterResponse setBody(UpdateFigureClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFigureClusterResponseBody getBody() {
        return this.body;
    }

}
