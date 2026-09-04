// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CompleteCodeBundleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CompleteCodeBundleResponseBody body;

    public static CompleteCodeBundleResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteCodeBundleResponse self = new CompleteCodeBundleResponse();
        return TeaModel.build(map, self);
    }

    public CompleteCodeBundleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteCodeBundleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompleteCodeBundleResponse setBody(CompleteCodeBundleResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteCodeBundleResponseBody getBody() {
        return this.body;
    }

}
