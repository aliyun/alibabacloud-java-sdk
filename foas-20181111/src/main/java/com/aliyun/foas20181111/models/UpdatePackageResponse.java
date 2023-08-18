// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class UpdatePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePackageResponseBody body;

    public static UpdatePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePackageResponse self = new UpdatePackageResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePackageResponse setBody(UpdatePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePackageResponseBody getBody() {
        return this.body;
    }

}
