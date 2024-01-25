// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class PutProductInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutProductInstanceConfigResponseBody body;

    public static PutProductInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PutProductInstanceConfigResponse self = new PutProductInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public PutProductInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutProductInstanceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutProductInstanceConfigResponse setBody(PutProductInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public PutProductInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
