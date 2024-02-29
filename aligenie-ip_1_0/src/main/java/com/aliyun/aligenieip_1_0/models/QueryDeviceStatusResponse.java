// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryDeviceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceStatusResponseBody body;

    public static QueryDeviceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceStatusResponse self = new QueryDeviceStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceStatusResponse setBody(QueryDeviceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceStatusResponseBody getBody() {
        return this.body;
    }

}
