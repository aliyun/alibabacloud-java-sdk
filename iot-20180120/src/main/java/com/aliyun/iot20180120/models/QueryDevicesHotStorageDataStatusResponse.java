// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicesHotStorageDataStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDevicesHotStorageDataStatusResponseBody body;

    public static QueryDevicesHotStorageDataStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicesHotStorageDataStatusResponse self = new QueryDevicesHotStorageDataStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicesHotStorageDataStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicesHotStorageDataStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDevicesHotStorageDataStatusResponse setBody(QueryDevicesHotStorageDataStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicesHotStorageDataStatusResponseBody getBody() {
        return this.body;
    }

}
