// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryFaultDeviceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFaultDeviceListResponseBody body;

    public static QueryFaultDeviceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaultDeviceListResponse self = new QueryFaultDeviceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaultDeviceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaultDeviceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFaultDeviceListResponse setBody(QueryFaultDeviceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaultDeviceListResponseBody getBody() {
        return this.body;
    }

}
