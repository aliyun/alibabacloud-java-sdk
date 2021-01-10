// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateFunctionFileUploadMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateFunctionFileUploadMetaResponseBody body;

    public static GenerateFunctionFileUploadMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateFunctionFileUploadMetaResponse self = new GenerateFunctionFileUploadMetaResponse();
        return TeaModel.build(map, self);
    }

    public GenerateFunctionFileUploadMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateFunctionFileUploadMetaResponse setBody(GenerateFunctionFileUploadMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateFunctionFileUploadMetaResponseBody getBody() {
        return this.body;
    }

}
