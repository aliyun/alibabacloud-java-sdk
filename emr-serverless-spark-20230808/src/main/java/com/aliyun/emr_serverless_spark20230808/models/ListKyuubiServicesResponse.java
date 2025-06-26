// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListKyuubiServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKyuubiServicesResponseBody body;

    public static ListKyuubiServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKyuubiServicesResponse self = new ListKyuubiServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListKyuubiServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKyuubiServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKyuubiServicesResponse setBody(ListKyuubiServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKyuubiServicesResponseBody getBody() {
        return this.body;
    }

}
