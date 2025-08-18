// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class StopWuyingServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopWuyingServerResponseBody body;

    public static StopWuyingServerResponse build(java.util.Map<String, ?> map) throws Exception {
        StopWuyingServerResponse self = new StopWuyingServerResponse();
        return TeaModel.build(map, self);
    }

    public StopWuyingServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopWuyingServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopWuyingServerResponse setBody(StopWuyingServerResponseBody body) {
        this.body = body;
        return this;
    }
    public StopWuyingServerResponseBody getBody() {
        return this.body;
    }

}
