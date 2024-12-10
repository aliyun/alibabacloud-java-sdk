// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class QueryDeviceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceListResponseBody body;

    public static QueryDeviceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceListResponse self = new QueryDeviceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceListResponse setBody(QueryDeviceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceListResponseBody getBody() {
        return this.body;
    }

}
