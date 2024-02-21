// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetOpenStoreUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOpenStoreUsageResponseBody body;

    public static GetOpenStoreUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpenStoreUsageResponse self = new GetOpenStoreUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetOpenStoreUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpenStoreUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpenStoreUsageResponse setBody(GetOpenStoreUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpenStoreUsageResponseBody getBody() {
        return this.body;
    }

}
