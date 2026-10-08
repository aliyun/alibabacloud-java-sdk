// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListUserAuthorizedResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserAuthorizedResourcesResponseBody body;

    public static ListUserAuthorizedResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserAuthorizedResourcesResponse self = new ListUserAuthorizedResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserAuthorizedResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserAuthorizedResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserAuthorizedResourcesResponse setBody(ListUserAuthorizedResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserAuthorizedResourcesResponseBody getBody() {
        return this.body;
    }

}
