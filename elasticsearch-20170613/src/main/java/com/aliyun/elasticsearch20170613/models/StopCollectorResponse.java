// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StopCollectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopCollectorResponseBody body;

    public static StopCollectorResponse build(java.util.Map<String, ?> map) throws Exception {
        StopCollectorResponse self = new StopCollectorResponse();
        return TeaModel.build(map, self);
    }

    public StopCollectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopCollectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopCollectorResponse setBody(StopCollectorResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCollectorResponseBody getBody() {
        return this.body;
    }

}
