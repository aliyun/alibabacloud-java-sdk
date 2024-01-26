// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UploadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadResponseBody body;

    public static UploadResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadResponse self = new UploadResponse();
        return TeaModel.build(map, self);
    }

    public UploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadResponse setBody(UploadResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadResponseBody getBody() {
        return this.body;
    }

}
