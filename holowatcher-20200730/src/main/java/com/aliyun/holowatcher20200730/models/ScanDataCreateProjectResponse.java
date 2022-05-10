// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ScanDataCreateProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ScanDataCreateProjectResponseBody body;

    public static ScanDataCreateProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanDataCreateProjectResponse self = new ScanDataCreateProjectResponse();
        return TeaModel.build(map, self);
    }

    public ScanDataCreateProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanDataCreateProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScanDataCreateProjectResponse setBody(ScanDataCreateProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanDataCreateProjectResponseBody getBody() {
        return this.body;
    }

}
