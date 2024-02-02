// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropertyStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDevicePropertyStatusResponseBody body;

    public static QueryDevicePropertyStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePropertyStatusResponse self = new QueryDevicePropertyStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePropertyStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicePropertyStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDevicePropertyStatusResponse setBody(QueryDevicePropertyStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicePropertyStatusResponseBody getBody() {
        return this.body;
    }

}
