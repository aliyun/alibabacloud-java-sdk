// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterAddonInstanceResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterAddonInstanceResourcesResponseBody body;

    public static ListClusterAddonInstanceResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAddonInstanceResourcesResponse self = new ListClusterAddonInstanceResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterAddonInstanceResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterAddonInstanceResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterAddonInstanceResourcesResponse setBody(ListClusterAddonInstanceResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterAddonInstanceResourcesResponseBody getBody() {
        return this.body;
    }

}
