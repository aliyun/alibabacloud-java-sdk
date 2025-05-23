// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class PushUserGameProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushUserGameProcessResponseBody body;

    public static PushUserGameProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        PushUserGameProcessResponse self = new PushUserGameProcessResponse();
        return TeaModel.build(map, self);
    }

    public PushUserGameProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushUserGameProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushUserGameProcessResponse setBody(PushUserGameProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public PushUserGameProcessResponseBody getBody() {
        return this.body;
    }

}
