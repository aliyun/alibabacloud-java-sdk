// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScanClusterVulsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ScanClusterVulsResponseBody body;

    public static ScanClusterVulsResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanClusterVulsResponse self = new ScanClusterVulsResponse();
        return TeaModel.build(map, self);
    }

    public ScanClusterVulsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanClusterVulsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScanClusterVulsResponse setBody(ScanClusterVulsResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanClusterVulsResponseBody getBody() {
        return this.body;
    }

}
