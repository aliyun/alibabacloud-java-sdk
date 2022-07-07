// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class PackageLightAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PackageLightAppResponseBody body;

    public static PackageLightAppResponse build(java.util.Map<String, ?> map) throws Exception {
        PackageLightAppResponse self = new PackageLightAppResponse();
        return TeaModel.build(map, self);
    }

    public PackageLightAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PackageLightAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PackageLightAppResponse setBody(PackageLightAppResponseBody body) {
        this.body = body;
        return this;
    }
    public PackageLightAppResponseBody getBody() {
        return this.body;
    }

}
