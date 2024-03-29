// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListAccessGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAccessGroupsResponseBody body;

    public static ListAccessGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessGroupsResponse self = new ListAccessGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccessGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccessGroupsResponse setBody(ListAccessGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessGroupsResponseBody getBody() {
        return this.body;
    }

}
