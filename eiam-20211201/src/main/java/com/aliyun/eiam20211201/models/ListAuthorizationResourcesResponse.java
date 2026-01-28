// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizationResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizationResourcesResponseBody body;

    public static ListAuthorizationResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationResourcesResponse self = new ListAuthorizationResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizationResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizationResourcesResponse setBody(ListAuthorizationResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizationResourcesResponseBody getBody() {
        return this.body;
    }

}
