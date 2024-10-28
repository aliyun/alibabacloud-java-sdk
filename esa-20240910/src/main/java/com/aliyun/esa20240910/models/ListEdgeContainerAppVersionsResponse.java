// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeContainerAppVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEdgeContainerAppVersionsResponseBody body;

    public static ListEdgeContainerAppVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeContainerAppVersionsResponse self = new ListEdgeContainerAppVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListEdgeContainerAppVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEdgeContainerAppVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEdgeContainerAppVersionsResponse setBody(ListEdgeContainerAppVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEdgeContainerAppVersionsResponseBody getBody() {
        return this.body;
    }

}
