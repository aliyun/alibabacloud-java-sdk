// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListPromClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPromClustersResponseBody body;

    public static ListPromClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPromClustersResponse self = new ListPromClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListPromClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPromClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPromClustersResponse setBody(ListPromClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPromClustersResponseBody getBody() {
        return this.body;
    }

}
