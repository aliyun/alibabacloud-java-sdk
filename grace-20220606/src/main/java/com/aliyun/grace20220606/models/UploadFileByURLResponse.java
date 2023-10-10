// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.grace20220606.models;

import com.aliyun.tea.*;

public class UploadFileByURLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadFileByURLResponseBody body;

    public static UploadFileByURLResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadFileByURLResponse self = new UploadFileByURLResponse();
        return TeaModel.build(map, self);
    }

    public UploadFileByURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadFileByURLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadFileByURLResponse setBody(UploadFileByURLResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadFileByURLResponseBody getBody() {
        return this.body;
    }

}
