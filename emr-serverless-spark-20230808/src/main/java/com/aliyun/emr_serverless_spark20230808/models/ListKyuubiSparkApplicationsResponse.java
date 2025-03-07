// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListKyuubiSparkApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKyuubiSparkApplicationsResponseBody body;

    public static ListKyuubiSparkApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKyuubiSparkApplicationsResponse self = new ListKyuubiSparkApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListKyuubiSparkApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKyuubiSparkApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKyuubiSparkApplicationsResponse setBody(ListKyuubiSparkApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKyuubiSparkApplicationsResponseBody getBody() {
        return this.body;
    }

}
