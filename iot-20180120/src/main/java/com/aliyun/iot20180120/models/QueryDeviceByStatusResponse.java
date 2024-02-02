// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceByStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceByStatusResponseBody body;

    public static QueryDeviceByStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceByStatusResponse self = new QueryDeviceByStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceByStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceByStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceByStatusResponse setBody(QueryDeviceByStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceByStatusResponseBody getBody() {
        return this.body;
    }

}
