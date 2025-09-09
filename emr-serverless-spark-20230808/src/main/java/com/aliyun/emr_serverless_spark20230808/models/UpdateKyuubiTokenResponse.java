// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class UpdateKyuubiTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKyuubiTokenResponseBody body;

    public static UpdateKyuubiTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKyuubiTokenResponse self = new UpdateKyuubiTokenResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKyuubiTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKyuubiTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKyuubiTokenResponse setBody(UpdateKyuubiTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKyuubiTokenResponseBody getBody() {
        return this.body;
    }

}
