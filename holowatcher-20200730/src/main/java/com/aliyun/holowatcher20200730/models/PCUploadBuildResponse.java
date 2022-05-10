// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class PCUploadBuildResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PCUploadBuildResponseBody body;

    public static PCUploadBuildResponse build(java.util.Map<String, ?> map) throws Exception {
        PCUploadBuildResponse self = new PCUploadBuildResponse();
        return TeaModel.build(map, self);
    }

    public PCUploadBuildResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PCUploadBuildResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PCUploadBuildResponse setBody(PCUploadBuildResponseBody body) {
        this.body = body;
        return this;
    }
    public PCUploadBuildResponseBody getBody() {
        return this.body;
    }

}
