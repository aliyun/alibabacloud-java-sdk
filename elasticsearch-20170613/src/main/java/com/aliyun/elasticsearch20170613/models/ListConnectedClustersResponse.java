// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListConnectedClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConnectedClustersResponseBody body;

    public static ListConnectedClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConnectedClustersResponse self = new ListConnectedClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListConnectedClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConnectedClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConnectedClustersResponse setBody(ListConnectedClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConnectedClustersResponseBody getBody() {
        return this.body;
    }

}
