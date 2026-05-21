// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListFollowerInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFollowerInstancesResponseBody body;

    public static ListFollowerInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFollowerInstancesResponse self = new ListFollowerInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListFollowerInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFollowerInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFollowerInstancesResponse setBody(ListFollowerInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFollowerInstancesResponseBody getBody() {
        return this.body;
    }

}
