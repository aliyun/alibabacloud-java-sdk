// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceEventDataResponseBody body;

    public static QueryDeviceEventDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventDataResponse self = new QueryDeviceEventDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceEventDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceEventDataResponse setBody(QueryDeviceEventDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceEventDataResponseBody getBody() {
        return this.body;
    }

}
