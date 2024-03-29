// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListFileSystemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFileSystemsResponseBody body;

    public static ListFileSystemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFileSystemsResponse self = new ListFileSystemsResponse();
        return TeaModel.build(map, self);
    }

    public ListFileSystemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFileSystemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFileSystemsResponse setBody(ListFileSystemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFileSystemsResponseBody getBody() {
        return this.body;
    }

}
