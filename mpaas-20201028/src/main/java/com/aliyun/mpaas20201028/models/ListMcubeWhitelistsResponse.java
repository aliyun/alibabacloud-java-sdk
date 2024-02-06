// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeWhitelistsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMcubeWhitelistsResponseBody body;

    public static ListMcubeWhitelistsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeWhitelistsResponse self = new ListMcubeWhitelistsResponse();
        return TeaModel.build(map, self);
    }

    public ListMcubeWhitelistsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcubeWhitelistsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMcubeWhitelistsResponse setBody(ListMcubeWhitelistsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcubeWhitelistsResponseBody getBody() {
        return this.body;
    }

}
