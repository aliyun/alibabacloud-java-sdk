// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListEcsNotInClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEcsNotInClusterResponseBody body;

    public static ListEcsNotInClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEcsNotInClusterResponse self = new ListEcsNotInClusterResponse();
        return TeaModel.build(map, self);
    }

    public ListEcsNotInClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEcsNotInClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEcsNotInClusterResponse setBody(ListEcsNotInClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEcsNotInClusterResponseBody getBody() {
        return this.body;
    }

}
