// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class FreezeUserPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FreezeUserPointResponseBody body;

    public static FreezeUserPointResponse build(java.util.Map<String, ?> map) throws Exception {
        FreezeUserPointResponse self = new FreezeUserPointResponse();
        return TeaModel.build(map, self);
    }

    public FreezeUserPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FreezeUserPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FreezeUserPointResponse setBody(FreezeUserPointResponseBody body) {
        this.body = body;
        return this;
    }
    public FreezeUserPointResponseBody getBody() {
        return this.body;
    }

}
