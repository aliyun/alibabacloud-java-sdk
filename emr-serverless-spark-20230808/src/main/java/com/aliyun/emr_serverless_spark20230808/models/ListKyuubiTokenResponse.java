// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListKyuubiTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKyuubiTokenResponseBody body;

    public static ListKyuubiTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKyuubiTokenResponse self = new ListKyuubiTokenResponse();
        return TeaModel.build(map, self);
    }

    public ListKyuubiTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKyuubiTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKyuubiTokenResponse setBody(ListKyuubiTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKyuubiTokenResponseBody getBody() {
        return this.body;
    }

}
