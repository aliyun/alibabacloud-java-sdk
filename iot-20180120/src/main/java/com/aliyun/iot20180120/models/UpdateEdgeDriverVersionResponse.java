// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateEdgeDriverVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEdgeDriverVersionResponseBody body;

    public static UpdateEdgeDriverVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeDriverVersionResponse self = new UpdateEdgeDriverVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeDriverVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEdgeDriverVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEdgeDriverVersionResponse setBody(UpdateEdgeDriverVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEdgeDriverVersionResponseBody getBody() {
        return this.body;
    }

}
