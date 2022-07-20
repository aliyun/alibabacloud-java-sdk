// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class VersionCheckSameNameServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VersionCheckSameNameServiceResponseBody body;

    public static VersionCheckSameNameServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        VersionCheckSameNameServiceResponse self = new VersionCheckSameNameServiceResponse();
        return TeaModel.build(map, self);
    }

    public VersionCheckSameNameServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VersionCheckSameNameServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VersionCheckSameNameServiceResponse setBody(VersionCheckSameNameServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public VersionCheckSameNameServiceResponseBody getBody() {
        return this.body;
    }

}
