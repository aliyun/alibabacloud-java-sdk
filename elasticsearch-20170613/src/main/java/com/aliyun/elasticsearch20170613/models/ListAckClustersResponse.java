// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAckClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAckClustersResponseBody body;

    public static ListAckClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAckClustersResponse self = new ListAckClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListAckClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAckClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAckClustersResponse setBody(ListAckClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAckClustersResponseBody getBody() {
        return this.body;
    }

}
