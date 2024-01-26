// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UploadImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadImageResponseBody body;

    public static UploadImageResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadImageResponse self = new UploadImageResponse();
        return TeaModel.build(map, self);
    }

    public UploadImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadImageResponse setBody(UploadImageResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadImageResponseBody getBody() {
        return this.body;
    }

}
