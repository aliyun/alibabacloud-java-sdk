// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RenewSessionPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RenewSessionPackageResponseBody body;

    public static RenewSessionPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewSessionPackageResponse self = new RenewSessionPackageResponse();
        return TeaModel.build(map, self);
    }

    public RenewSessionPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewSessionPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewSessionPackageResponse setBody(RenewSessionPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewSessionPackageResponseBody getBody() {
        return this.body;
    }

}
