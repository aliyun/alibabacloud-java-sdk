// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateBundleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBundleResponseBody body;

    public static CreateBundleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBundleResponse self = new CreateBundleResponse();
        return TeaModel.build(map, self);
    }

    public CreateBundleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBundleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBundleResponse setBody(CreateBundleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBundleResponseBody getBody() {
        return this.body;
    }

}
