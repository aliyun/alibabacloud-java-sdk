// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class StartWuyingServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartWuyingServerResponseBody body;

    public static StartWuyingServerResponse build(java.util.Map<String, ?> map) throws Exception {
        StartWuyingServerResponse self = new StartWuyingServerResponse();
        return TeaModel.build(map, self);
    }

    public StartWuyingServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartWuyingServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartWuyingServerResponse setBody(StartWuyingServerResponseBody body) {
        this.body = body;
        return this;
    }
    public StartWuyingServerResponseBody getBody() {
        return this.body;
    }

}
