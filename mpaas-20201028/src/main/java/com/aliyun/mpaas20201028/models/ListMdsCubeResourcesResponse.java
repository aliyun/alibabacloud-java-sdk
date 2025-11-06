// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMdsCubeResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMdsCubeResourcesResponseBody body;

    public static ListMdsCubeResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMdsCubeResourcesResponse self = new ListMdsCubeResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListMdsCubeResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMdsCubeResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMdsCubeResourcesResponse setBody(ListMdsCubeResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMdsCubeResourcesResponseBody getBody() {
        return this.body;
    }

}
