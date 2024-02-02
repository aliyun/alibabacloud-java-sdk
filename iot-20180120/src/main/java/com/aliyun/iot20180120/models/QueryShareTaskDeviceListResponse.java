// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryShareTaskDeviceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryShareTaskDeviceListResponseBody body;

    public static QueryShareTaskDeviceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryShareTaskDeviceListResponse self = new QueryShareTaskDeviceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryShareTaskDeviceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryShareTaskDeviceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryShareTaskDeviceListResponse setBody(QueryShareTaskDeviceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryShareTaskDeviceListResponseBody getBody() {
        return this.body;
    }

}
