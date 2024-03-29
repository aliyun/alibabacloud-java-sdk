// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListMountPointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMountPointsResponseBody body;

    public static ListMountPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMountPointsResponse self = new ListMountPointsResponse();
        return TeaModel.build(map, self);
    }

    public ListMountPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMountPointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMountPointsResponse setBody(ListMountPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMountPointsResponseBody getBody() {
        return this.body;
    }

}
