// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceCertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceCertResponseBody body;

    public static QueryDeviceCertResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceCertResponse self = new QueryDeviceCertResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceCertResponse setBody(QueryDeviceCertResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceCertResponseBody getBody() {
        return this.body;
    }

}
