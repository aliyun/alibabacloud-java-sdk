// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class StartTaskForDistributeImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartTaskForDistributeImageResponseBody body;

    public static StartTaskForDistributeImageResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTaskForDistributeImageResponse self = new StartTaskForDistributeImageResponse();
        return TeaModel.build(map, self);
    }

    public StartTaskForDistributeImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartTaskForDistributeImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartTaskForDistributeImageResponse setBody(StartTaskForDistributeImageResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTaskForDistributeImageResponseBody getBody() {
        return this.body;
    }

}
