// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class AliyunConsoleOpenApiQueryPaidResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AliyunConsoleOpenApiQueryPaidResourceResponseBody body;

    public static AliyunConsoleOpenApiQueryPaidResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AliyunConsoleOpenApiQueryPaidResourceResponse self = new AliyunConsoleOpenApiQueryPaidResourceResponse();
        return TeaModel.build(map, self);
    }

    public AliyunConsoleOpenApiQueryPaidResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AliyunConsoleOpenApiQueryPaidResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AliyunConsoleOpenApiQueryPaidResourceResponse setBody(AliyunConsoleOpenApiQueryPaidResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public AliyunConsoleOpenApiQueryPaidResourceResponseBody getBody() {
        return this.body;
    }

}
