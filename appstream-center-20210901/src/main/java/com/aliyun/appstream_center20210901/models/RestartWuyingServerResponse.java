// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RestartWuyingServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartWuyingServerResponseBody body;

    public static RestartWuyingServerResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartWuyingServerResponse self = new RestartWuyingServerResponse();
        return TeaModel.build(map, self);
    }

    public RestartWuyingServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartWuyingServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartWuyingServerResponse setBody(RestartWuyingServerResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartWuyingServerResponseBody getBody() {
        return this.body;
    }

}
