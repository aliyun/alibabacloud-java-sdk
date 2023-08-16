// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessTagsForDynamicRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPrivateAccessTagsForDynamicRouteResponseBody body;

    public static ListPrivateAccessTagsForDynamicRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessTagsForDynamicRouteResponse self = new ListPrivateAccessTagsForDynamicRouteResponse();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessTagsForDynamicRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrivateAccessTagsForDynamicRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrivateAccessTagsForDynamicRouteResponse setBody(ListPrivateAccessTagsForDynamicRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrivateAccessTagsForDynamicRouteResponseBody getBody() {
        return this.body;
    }

}
