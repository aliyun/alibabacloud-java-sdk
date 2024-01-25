// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDynamicRouteRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDynamicRouteRegionsResponseBody body;

    public static ListDynamicRouteRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicRouteRegionsResponse self = new ListDynamicRouteRegionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDynamicRouteRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDynamicRouteRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDynamicRouteRegionsResponse setBody(ListDynamicRouteRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDynamicRouteRegionsResponseBody getBody() {
        return this.body;
    }

}
