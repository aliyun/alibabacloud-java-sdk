// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ListDedicatedClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDedicatedClusterResponseBody body;

    public static ListDedicatedClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDedicatedClusterResponse self = new ListDedicatedClusterResponse();
        return TeaModel.build(map, self);
    }

    public ListDedicatedClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDedicatedClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDedicatedClusterResponse setBody(ListDedicatedClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDedicatedClusterResponseBody getBody() {
        return this.body;
    }

}
