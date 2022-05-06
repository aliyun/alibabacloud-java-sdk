// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListFileSystemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListFileSystemsResponse setBody(ListFileSystemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFileSystemsResponseBody getBody() {
        return this.body;
    }

}
