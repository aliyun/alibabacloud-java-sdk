// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductVersionPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProductVersionPackageResponseBody body;

    public static GetProductVersionPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionPackageResponse self = new GetProductVersionPackageResponse();
        return TeaModel.build(map, self);
    }

    public GetProductVersionPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductVersionPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductVersionPackageResponse setBody(GetProductVersionPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductVersionPackageResponseBody getBody() {
        return this.body;
    }

}
