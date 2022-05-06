// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListAccessGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListAccessGroupsResponse setBody(ListAccessGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessGroupsResponseBody getBody() {
        return this.body;
    }

}
