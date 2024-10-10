// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCacheReserveInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCacheReserveInstancesResponseBody body;

    public static ListCacheReserveInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCacheReserveInstancesResponse self = new ListCacheReserveInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListCacheReserveInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCacheReserveInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCacheReserveInstancesResponse setBody(ListCacheReserveInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCacheReserveInstancesResponseBody getBody() {
        return this.body;
    }

}
