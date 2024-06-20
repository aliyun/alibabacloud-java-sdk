// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StopMinutesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopMinutesResponseBody body;

    public static StopMinutesResponse build(java.util.Map<String, ?> map) throws Exception {
        StopMinutesResponse self = new StopMinutesResponse();
        return TeaModel.build(map, self);
    }

    public StopMinutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopMinutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopMinutesResponse setBody(StopMinutesResponseBody body) {
        this.body = body;
        return this;
    }
    public StopMinutesResponseBody getBody() {
        return this.body;
    }

}
