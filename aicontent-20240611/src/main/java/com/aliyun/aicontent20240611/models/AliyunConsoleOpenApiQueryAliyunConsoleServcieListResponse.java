// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody body;

    public static AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse build(java.util.Map<String, ?> map) throws Exception {
        AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse self = new AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse();
        return TeaModel.build(map, self);
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse setBody(AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody body) {
        this.body = body;
        return this;
    }
    public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody getBody() {
        return this.body;
    }

}
