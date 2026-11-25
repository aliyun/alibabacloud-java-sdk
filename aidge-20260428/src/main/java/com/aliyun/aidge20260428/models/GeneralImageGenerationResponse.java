// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class GeneralImageGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GeneralImageGenerationResponseBody body;

    public static GeneralImageGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        GeneralImageGenerationResponse self = new GeneralImageGenerationResponse();
        return TeaModel.build(map, self);
    }

    public GeneralImageGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GeneralImageGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GeneralImageGenerationResponse setBody(GeneralImageGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public GeneralImageGenerationResponseBody getBody() {
        return this.body;
    }

}
