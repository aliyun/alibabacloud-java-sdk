// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ScanDataShareProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ScanDataShareProjectResponseBody body;

    public static ScanDataShareProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanDataShareProjectResponse self = new ScanDataShareProjectResponse();
        return TeaModel.build(map, self);
    }

    public ScanDataShareProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanDataShareProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScanDataShareProjectResponse setBody(ScanDataShareProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanDataShareProjectResponseBody getBody() {
        return this.body;
    }

}
