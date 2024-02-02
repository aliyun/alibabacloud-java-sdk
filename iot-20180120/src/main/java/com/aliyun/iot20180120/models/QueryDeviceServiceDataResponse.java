// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceServiceDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceServiceDataResponseBody body;

    public static QueryDeviceServiceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceServiceDataResponse self = new QueryDeviceServiceDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceServiceDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceServiceDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceServiceDataResponse setBody(QueryDeviceServiceDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceServiceDataResponseBody getBody() {
        return this.body;
    }

}
