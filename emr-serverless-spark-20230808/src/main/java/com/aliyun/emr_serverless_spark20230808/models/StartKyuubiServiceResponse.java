// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StartKyuubiServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartKyuubiServiceResponseBody body;

    public static StartKyuubiServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartKyuubiServiceResponse self = new StartKyuubiServiceResponse();
        return TeaModel.build(map, self);
    }

    public StartKyuubiServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartKyuubiServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartKyuubiServiceResponse setBody(StartKyuubiServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartKyuubiServiceResponseBody getBody() {
        return this.body;
    }

}
