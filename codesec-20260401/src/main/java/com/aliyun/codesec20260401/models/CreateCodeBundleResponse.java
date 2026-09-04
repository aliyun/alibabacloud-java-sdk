// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CreateCodeBundleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCodeBundleResponseBody body;

    public static CreateCodeBundleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCodeBundleResponse self = new CreateCodeBundleResponse();
        return TeaModel.build(map, self);
    }

    public CreateCodeBundleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCodeBundleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCodeBundleResponse setBody(CreateCodeBundleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCodeBundleResponseBody getBody() {
        return this.body;
    }

}
