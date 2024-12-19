// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class UnFreezeUserPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnFreezeUserPointResponseBody body;

    public static UnFreezeUserPointResponse build(java.util.Map<String, ?> map) throws Exception {
        UnFreezeUserPointResponse self = new UnFreezeUserPointResponse();
        return TeaModel.build(map, self);
    }

    public UnFreezeUserPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnFreezeUserPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnFreezeUserPointResponse setBody(UnFreezeUserPointResponseBody body) {
        this.body = body;
        return this;
    }
    public UnFreezeUserPointResponseBody getBody() {
        return this.body;
    }

}
