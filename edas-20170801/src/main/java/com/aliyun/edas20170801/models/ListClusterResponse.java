// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterResponseBody body;

    public static ListClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterResponse self = new ListClusterResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterResponse setBody(ListClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterResponseBody getBody() {
        return this.body;
    }

}
