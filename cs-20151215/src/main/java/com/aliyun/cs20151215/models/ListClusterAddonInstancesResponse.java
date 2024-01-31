// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterAddonInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterAddonInstancesResponseBody body;

    public static ListClusterAddonInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAddonInstancesResponse self = new ListClusterAddonInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterAddonInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterAddonInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterAddonInstancesResponse setBody(ListClusterAddonInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterAddonInstancesResponseBody getBody() {
        return this.body;
    }

}
