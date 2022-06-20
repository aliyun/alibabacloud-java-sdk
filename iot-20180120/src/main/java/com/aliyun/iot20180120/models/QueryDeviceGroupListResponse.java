// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceGroupListResponseBody body;

    public static QueryDeviceGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupListResponse self = new QueryDeviceGroupListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceGroupListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceGroupListResponse setBody(QueryDeviceGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceGroupListResponseBody getBody() {
        return this.body;
    }

}
