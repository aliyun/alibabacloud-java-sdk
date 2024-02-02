// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDesiredPropertyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceDesiredPropertyResponseBody body;

    public static QueryDeviceDesiredPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDesiredPropertyResponse self = new QueryDeviceDesiredPropertyResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDesiredPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceDesiredPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceDesiredPropertyResponse setBody(QueryDeviceDesiredPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceDesiredPropertyResponseBody getBody() {
        return this.body;
    }

}
