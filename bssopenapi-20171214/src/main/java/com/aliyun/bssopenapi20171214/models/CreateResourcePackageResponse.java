// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateResourcePackageResponseBody body;

    public static CreateResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourcePackageResponse self = new CreateResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourcePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourcePackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResourcePackageResponse setBody(CreateResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourcePackageResponseBody getBody() {
        return this.body;
    }

}
