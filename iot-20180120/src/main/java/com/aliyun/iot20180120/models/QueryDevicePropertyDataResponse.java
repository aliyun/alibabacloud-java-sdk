// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropertyDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDevicePropertyDataResponseBody body;

    public static QueryDevicePropertyDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePropertyDataResponse self = new QueryDevicePropertyDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePropertyDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicePropertyDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDevicePropertyDataResponse setBody(QueryDevicePropertyDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicePropertyDataResponseBody getBody() {
        return this.body;
    }

}
