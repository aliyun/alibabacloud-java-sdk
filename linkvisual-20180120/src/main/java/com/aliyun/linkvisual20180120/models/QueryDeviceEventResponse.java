// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceEventResponseBody body;

    public static QueryDeviceEventResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventResponse self = new QueryDeviceEventResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceEventResponse setBody(QueryDeviceEventResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceEventResponseBody getBody() {
        return this.body;
    }

}
