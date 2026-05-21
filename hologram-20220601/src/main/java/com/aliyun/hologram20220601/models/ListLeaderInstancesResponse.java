// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListLeaderInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLeaderInstancesResponseBody body;

    public static ListLeaderInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLeaderInstancesResponse self = new ListLeaderInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListLeaderInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLeaderInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLeaderInstancesResponse setBody(ListLeaderInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLeaderInstancesResponseBody getBody() {
        return this.body;
    }

}
