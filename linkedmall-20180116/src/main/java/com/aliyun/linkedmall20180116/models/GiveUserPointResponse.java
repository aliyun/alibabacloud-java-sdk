// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GiveUserPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GiveUserPointResponseBody body;

    public static GiveUserPointResponse build(java.util.Map<String, ?> map) throws Exception {
        GiveUserPointResponse self = new GiveUserPointResponse();
        return TeaModel.build(map, self);
    }

    public GiveUserPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GiveUserPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GiveUserPointResponse setBody(GiveUserPointResponseBody body) {
        this.body = body;
        return this;
    }
    public GiveUserPointResponseBody getBody() {
        return this.body;
    }

}
