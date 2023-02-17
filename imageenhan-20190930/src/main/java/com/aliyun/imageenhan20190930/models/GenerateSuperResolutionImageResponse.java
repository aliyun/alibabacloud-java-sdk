// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateSuperResolutionImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateSuperResolutionImageResponseBody body;

    public static GenerateSuperResolutionImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateSuperResolutionImageResponse self = new GenerateSuperResolutionImageResponse();
        return TeaModel.build(map, self);
    }

    public GenerateSuperResolutionImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateSuperResolutionImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateSuperResolutionImageResponse setBody(GenerateSuperResolutionImageResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateSuperResolutionImageResponseBody getBody() {
        return this.body;
    }

}
