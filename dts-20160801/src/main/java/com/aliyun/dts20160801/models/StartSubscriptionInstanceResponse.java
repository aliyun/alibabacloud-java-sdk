// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class StartSubscriptionInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartSubscriptionInstanceResponseBody body;

    public static StartSubscriptionInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartSubscriptionInstanceResponse self = new StartSubscriptionInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartSubscriptionInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartSubscriptionInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartSubscriptionInstanceResponse setBody(StartSubscriptionInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartSubscriptionInstanceResponseBody getBody() {
        return this.body;
    }

}
