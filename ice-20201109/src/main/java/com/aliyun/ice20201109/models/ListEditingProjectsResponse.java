// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListEditingProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEditingProjectsResponseBody body;

    public static ListEditingProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEditingProjectsResponse self = new ListEditingProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListEditingProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEditingProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEditingProjectsResponse setBody(ListEditingProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEditingProjectsResponseBody getBody() {
        return this.body;
    }

}
