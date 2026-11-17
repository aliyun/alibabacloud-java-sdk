// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class StartTaskForCreateImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartTaskForCreateImageResponseBody body;

    public static StartTaskForCreateImageResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTaskForCreateImageResponse self = new StartTaskForCreateImageResponse();
        return TeaModel.build(map, self);
    }

    public StartTaskForCreateImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartTaskForCreateImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartTaskForCreateImageResponse setBody(StartTaskForCreateImageResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTaskForCreateImageResponseBody getBody() {
        return this.body;
    }

}
