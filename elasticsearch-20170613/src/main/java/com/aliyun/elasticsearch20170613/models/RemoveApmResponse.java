// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RemoveApmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveApmResponseBody body;

    public static RemoveApmResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveApmResponse self = new RemoveApmResponse();
        return TeaModel.build(map, self);
    }

    public RemoveApmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveApmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveApmResponse setBody(RemoveApmResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveApmResponseBody getBody() {
        return this.body;
    }

}
