// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateAssistFileUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateAssistFileUploadUrlResponseBody body;

    public static GenerateAssistFileUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAssistFileUploadUrlResponse self = new GenerateAssistFileUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAssistFileUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAssistFileUploadUrlResponse setBody(GenerateAssistFileUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAssistFileUploadUrlResponseBody getBody() {
        return this.body;
    }

}
