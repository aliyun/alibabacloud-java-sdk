// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryDeviceDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceDetailResponseBody body;

    public static QueryDeviceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDetailResponse self = new QueryDeviceDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceDetailResponse setBody(QueryDeviceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceDetailResponseBody getBody() {
        return this.body;
    }

}
