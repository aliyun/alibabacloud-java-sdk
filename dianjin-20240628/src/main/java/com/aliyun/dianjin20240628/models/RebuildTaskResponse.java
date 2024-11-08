// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RebuildTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebuildTaskResponseBody body;

    public static RebuildTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RebuildTaskResponse self = new RebuildTaskResponse();
        return TeaModel.build(map, self);
    }

    public RebuildTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebuildTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebuildTaskResponse setBody(RebuildTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RebuildTaskResponseBody getBody() {
        return this.body;
    }

}
