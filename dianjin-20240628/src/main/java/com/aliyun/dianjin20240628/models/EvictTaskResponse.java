// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class EvictTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EvictTaskResponseBody body;

    public static EvictTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        EvictTaskResponse self = new EvictTaskResponse();
        return TeaModel.build(map, self);
    }

    public EvictTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EvictTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EvictTaskResponse setBody(EvictTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public EvictTaskResponseBody getBody() {
        return this.body;
    }

}
