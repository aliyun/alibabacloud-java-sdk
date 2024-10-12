// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponseBody body;

    public static AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse build(java.util.Map<String, ?> map) throws Exception {
        AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse self = new AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse();
        return TeaModel.build(map, self);
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse setBody(AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponseBody body) {
        this.body = body;
        return this;
    }
    public AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponseBody getBody() {
        return this.body;
    }

}
