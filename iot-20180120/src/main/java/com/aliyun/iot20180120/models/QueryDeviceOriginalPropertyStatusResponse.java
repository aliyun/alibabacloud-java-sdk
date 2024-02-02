// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalPropertyStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceOriginalPropertyStatusResponseBody body;

    public static QueryDeviceOriginalPropertyStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalPropertyStatusResponse self = new QueryDeviceOriginalPropertyStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalPropertyStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceOriginalPropertyStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceOriginalPropertyStatusResponse setBody(QueryDeviceOriginalPropertyStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceOriginalPropertyStatusResponseBody getBody() {
        return this.body;
    }

}
