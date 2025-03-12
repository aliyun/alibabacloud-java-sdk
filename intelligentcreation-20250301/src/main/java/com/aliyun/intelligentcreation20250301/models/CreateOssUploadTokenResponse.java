// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20250301.models;

import com.aliyun.tea.*;

public class CreateOssUploadTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOssUploadTokenResponseBody body;

    public static CreateOssUploadTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOssUploadTokenResponse self = new CreateOssUploadTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateOssUploadTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOssUploadTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOssUploadTokenResponse setBody(CreateOssUploadTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOssUploadTokenResponseBody getBody() {
        return this.body;
    }

}
