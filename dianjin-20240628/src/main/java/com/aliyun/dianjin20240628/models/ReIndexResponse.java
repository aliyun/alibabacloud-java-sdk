// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class ReIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReIndexResponseBody body;

    public static ReIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        ReIndexResponse self = new ReIndexResponse();
        return TeaModel.build(map, self);
    }

    public ReIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReIndexResponse setBody(ReIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public ReIndexResponseBody getBody() {
        return this.body;
    }

}
