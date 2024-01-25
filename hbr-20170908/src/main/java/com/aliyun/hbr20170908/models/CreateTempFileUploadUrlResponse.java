// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateTempFileUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTempFileUploadUrlResponseBody body;

    public static CreateTempFileUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTempFileUploadUrlResponse self = new CreateTempFileUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public CreateTempFileUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTempFileUploadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTempFileUploadUrlResponse setBody(CreateTempFileUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTempFileUploadUrlResponseBody getBody() {
        return this.body;
    }

}
