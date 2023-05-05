// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class SubscribeAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubscribeAppResponseBody body;

    public static SubscribeAppResponse build(java.util.Map<String, ?> map) throws Exception {
        SubscribeAppResponse self = new SubscribeAppResponse();
        return TeaModel.build(map, self);
    }

    public SubscribeAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubscribeAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubscribeAppResponse setBody(SubscribeAppResponseBody body) {
        this.body = body;
        return this;
    }
    public SubscribeAppResponseBody getBody() {
        return this.body;
    }

}
