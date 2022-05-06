// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListMountPointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListMountPointsResponse setBody(ListMountPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMountPointsResponseBody getBody() {
        return this.body;
    }

}
