// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class DeleteEnvironmentLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEnvironmentLicenseResponseBody body;

    public static DeleteEnvironmentLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvironmentLicenseResponse self = new DeleteEnvironmentLicenseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnvironmentLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnvironmentLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEnvironmentLicenseResponse setBody(DeleteEnvironmentLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnvironmentLicenseResponseBody getBody() {
        return this.body;
    }

}
