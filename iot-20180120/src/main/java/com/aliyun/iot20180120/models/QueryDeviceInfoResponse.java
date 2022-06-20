// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceInfoResponseBody body;

    public static QueryDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceInfoResponse self = new QueryDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceInfoResponse setBody(QueryDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
