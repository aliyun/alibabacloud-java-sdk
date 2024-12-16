// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UploadDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadDocResponseBody body;

    public static UploadDocResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadDocResponse self = new UploadDocResponse();
        return TeaModel.build(map, self);
    }

    public UploadDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadDocResponse setBody(UploadDocResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadDocResponseBody getBody() {
        return this.body;
    }

}
