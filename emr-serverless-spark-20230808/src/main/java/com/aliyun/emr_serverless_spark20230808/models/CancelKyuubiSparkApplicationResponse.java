// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CancelKyuubiSparkApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelKyuubiSparkApplicationResponseBody body;

    public static CancelKyuubiSparkApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelKyuubiSparkApplicationResponse self = new CancelKyuubiSparkApplicationResponse();
        return TeaModel.build(map, self);
    }

    public CancelKyuubiSparkApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelKyuubiSparkApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelKyuubiSparkApplicationResponse setBody(CancelKyuubiSparkApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelKyuubiSparkApplicationResponseBody getBody() {
        return this.body;
    }

}
