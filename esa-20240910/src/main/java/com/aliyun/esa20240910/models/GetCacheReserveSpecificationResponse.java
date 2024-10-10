// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCacheReserveSpecificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCacheReserveSpecificationResponseBody body;

    public static GetCacheReserveSpecificationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCacheReserveSpecificationResponse self = new GetCacheReserveSpecificationResponse();
        return TeaModel.build(map, self);
    }

    public GetCacheReserveSpecificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCacheReserveSpecificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCacheReserveSpecificationResponse setBody(GetCacheReserveSpecificationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCacheReserveSpecificationResponseBody getBody() {
        return this.body;
    }

}
