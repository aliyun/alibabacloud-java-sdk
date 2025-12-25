// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ListClickHouseDBTimezonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClickHouseDBTimezonesResponseBody body;

    public static ListClickHouseDBTimezonesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClickHouseDBTimezonesResponse self = new ListClickHouseDBTimezonesResponse();
        return TeaModel.build(map, self);
    }

    public ListClickHouseDBTimezonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClickHouseDBTimezonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClickHouseDBTimezonesResponse setBody(ListClickHouseDBTimezonesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClickHouseDBTimezonesResponseBody getBody() {
        return this.body;
    }

}
