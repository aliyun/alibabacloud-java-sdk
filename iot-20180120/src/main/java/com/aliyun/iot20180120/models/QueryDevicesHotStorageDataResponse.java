// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicesHotStorageDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDevicesHotStorageDataResponseBody body;

    public static QueryDevicesHotStorageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicesHotStorageDataResponse self = new QueryDevicesHotStorageDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicesHotStorageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicesHotStorageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDevicesHotStorageDataResponse setBody(QueryDevicesHotStorageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicesHotStorageDataResponseBody getBody() {
        return this.body;
    }

}
