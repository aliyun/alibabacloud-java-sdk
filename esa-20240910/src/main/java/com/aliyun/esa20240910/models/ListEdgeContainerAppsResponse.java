// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeContainerAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEdgeContainerAppsResponseBody body;

    public static ListEdgeContainerAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeContainerAppsResponse self = new ListEdgeContainerAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListEdgeContainerAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEdgeContainerAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEdgeContainerAppsResponse setBody(ListEdgeContainerAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEdgeContainerAppsResponseBody getBody() {
        return this.body;
    }

}
