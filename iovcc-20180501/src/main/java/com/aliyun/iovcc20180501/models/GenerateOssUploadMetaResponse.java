// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateOssUploadMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateOssUploadMetaResponseBody body;

    public static GenerateOssUploadMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateOssUploadMetaResponse self = new GenerateOssUploadMetaResponse();
        return TeaModel.build(map, self);
    }

    public GenerateOssUploadMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateOssUploadMetaResponse setBody(GenerateOssUploadMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateOssUploadMetaResponseBody getBody() {
        return this.body;
    }

}
