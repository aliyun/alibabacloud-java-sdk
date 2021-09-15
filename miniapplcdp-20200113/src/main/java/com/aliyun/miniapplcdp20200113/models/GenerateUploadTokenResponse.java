// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GenerateUploadTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateUploadTokenResponseBody body;

    public static GenerateUploadTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadTokenResponse self = new GenerateUploadTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateUploadTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateUploadTokenResponse setBody(GenerateUploadTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateUploadTokenResponseBody getBody() {
        return this.body;
    }

}
