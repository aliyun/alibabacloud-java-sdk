// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class ListMyGroupInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMyGroupInstancesResponseBody body;

    public static ListMyGroupInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMyGroupInstancesResponse self = new ListMyGroupInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListMyGroupInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMyGroupInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMyGroupInstancesResponse setBody(ListMyGroupInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMyGroupInstancesResponseBody getBody() {
        return this.body;
    }

}
