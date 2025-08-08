// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListShareResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListShareResourcesResponseBody body;

    public static ListShareResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListShareResourcesResponse self = new ListShareResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListShareResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListShareResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListShareResourcesResponse setBody(ListShareResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListShareResourcesResponseBody getBody() {
        return this.body;
    }

}
