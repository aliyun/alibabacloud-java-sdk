// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class SparkRelateHBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SparkRelateHBaseResponseBody body;

    public static SparkRelateHBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        SparkRelateHBaseResponse self = new SparkRelateHBaseResponse();
        return TeaModel.build(map, self);
    }

    public SparkRelateHBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SparkRelateHBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SparkRelateHBaseResponse setBody(SparkRelateHBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public SparkRelateHBaseResponseBody getBody() {
        return this.body;
    }

}
