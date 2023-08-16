// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessApplicationsForDynamicRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPrivateAccessApplicationsForDynamicRouteResponseBody body;

    public static ListPrivateAccessApplicationsForDynamicRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessApplicationsForDynamicRouteResponse self = new ListPrivateAccessApplicationsForDynamicRouteResponse();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessApplicationsForDynamicRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrivateAccessApplicationsForDynamicRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrivateAccessApplicationsForDynamicRouteResponse setBody(ListPrivateAccessApplicationsForDynamicRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrivateAccessApplicationsForDynamicRouteResponseBody getBody() {
        return this.body;
    }

}
