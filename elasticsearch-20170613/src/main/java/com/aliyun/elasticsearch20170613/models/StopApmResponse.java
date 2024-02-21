// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StopApmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopApmResponseBody body;

    public static StopApmResponse build(java.util.Map<String, ?> map) throws Exception {
        StopApmResponse self = new StopApmResponse();
        return TeaModel.build(map, self);
    }

    public StopApmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopApmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopApmResponse setBody(StopApmResponseBody body) {
        this.body = body;
        return this;
    }
    public StopApmResponseBody getBody() {
        return this.body;
    }

}
