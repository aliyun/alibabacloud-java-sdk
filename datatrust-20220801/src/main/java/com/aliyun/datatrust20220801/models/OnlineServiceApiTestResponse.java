// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class OnlineServiceApiTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OnlineServiceApiTestResponseBody body;

    public static OnlineServiceApiTestResponse build(java.util.Map<String, ?> map) throws Exception {
        OnlineServiceApiTestResponse self = new OnlineServiceApiTestResponse();
        return TeaModel.build(map, self);
    }

    public OnlineServiceApiTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnlineServiceApiTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnlineServiceApiTestResponse setBody(OnlineServiceApiTestResponseBody body) {
        this.body = body;
        return this;
    }
    public OnlineServiceApiTestResponseBody getBody() {
        return this.body;
    }

}
