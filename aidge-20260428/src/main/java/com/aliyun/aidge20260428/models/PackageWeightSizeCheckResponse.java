// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class PackageWeightSizeCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PackageWeightSizeCheckResponseBody body;

    public static PackageWeightSizeCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        PackageWeightSizeCheckResponse self = new PackageWeightSizeCheckResponse();
        return TeaModel.build(map, self);
    }

    public PackageWeightSizeCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PackageWeightSizeCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PackageWeightSizeCheckResponse setBody(PackageWeightSizeCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public PackageWeightSizeCheckResponseBody getBody() {
        return this.body;
    }

}
