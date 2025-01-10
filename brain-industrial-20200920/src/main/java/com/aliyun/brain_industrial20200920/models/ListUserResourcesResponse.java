// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListUserResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserResourcesResponseBody body;

    public static ListUserResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserResourcesResponse self = new ListUserResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserResourcesResponse setBody(ListUserResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserResourcesResponseBody getBody() {
        return this.body;
    }

}
