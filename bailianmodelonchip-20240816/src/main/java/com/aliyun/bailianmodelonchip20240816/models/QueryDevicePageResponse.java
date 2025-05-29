// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class QueryDevicePageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDevicePageResponseBody body;

    public static QueryDevicePageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePageResponse self = new QueryDevicePageResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicePageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDevicePageResponse setBody(QueryDevicePageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicePageResponseBody getBody() {
        return this.body;
    }

}
