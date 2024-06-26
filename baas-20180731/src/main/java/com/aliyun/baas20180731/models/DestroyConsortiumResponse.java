// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DestroyConsortiumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DestroyConsortiumResponseBody body;

    public static DestroyConsortiumResponse build(java.util.Map<String, ?> map) throws Exception {
        DestroyConsortiumResponse self = new DestroyConsortiumResponse();
        return TeaModel.build(map, self);
    }

    public DestroyConsortiumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DestroyConsortiumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DestroyConsortiumResponse setBody(DestroyConsortiumResponseBody body) {
        this.body = body;
        return this;
    }
    public DestroyConsortiumResponseBody getBody() {
        return this.body;
    }

}
