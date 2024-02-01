// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryGbSubDeviceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryGbSubDeviceListResponseBody body;

    public static QueryGbSubDeviceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGbSubDeviceListResponse self = new QueryGbSubDeviceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryGbSubDeviceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGbSubDeviceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGbSubDeviceListResponse setBody(QueryGbSubDeviceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGbSubDeviceListResponseBody getBody() {
        return this.body;
    }

}
