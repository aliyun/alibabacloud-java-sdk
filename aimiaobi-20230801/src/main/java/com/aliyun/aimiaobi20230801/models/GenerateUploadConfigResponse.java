// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateUploadConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateUploadConfigResponseBody body;

    public static GenerateUploadConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadConfigResponse self = new GenerateUploadConfigResponse();
        return TeaModel.build(map, self);
    }

    public GenerateUploadConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateUploadConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateUploadConfigResponse setBody(GenerateUploadConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateUploadConfigResponseBody getBody() {
        return this.body;
    }

}
