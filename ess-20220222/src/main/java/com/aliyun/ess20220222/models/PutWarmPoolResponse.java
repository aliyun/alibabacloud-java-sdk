// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class PutWarmPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutWarmPoolResponseBody body;

    public static PutWarmPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        PutWarmPoolResponse self = new PutWarmPoolResponse();
        return TeaModel.build(map, self);
    }

    public PutWarmPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutWarmPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutWarmPoolResponse setBody(PutWarmPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public PutWarmPoolResponseBody getBody() {
        return this.body;
    }

}
