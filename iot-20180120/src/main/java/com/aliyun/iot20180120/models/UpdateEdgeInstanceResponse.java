// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEdgeInstanceResponseBody body;

    public static UpdateEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeInstanceResponse self = new UpdateEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEdgeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEdgeInstanceResponse setBody(UpdateEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
