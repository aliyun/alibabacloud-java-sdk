// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class DeleteKyuubiTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKyuubiTokenResponseBody body;

    public static DeleteKyuubiTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKyuubiTokenResponse self = new DeleteKyuubiTokenResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKyuubiTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKyuubiTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKyuubiTokenResponse setBody(DeleteKyuubiTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKyuubiTokenResponseBody getBody() {
        return this.body;
    }

}
