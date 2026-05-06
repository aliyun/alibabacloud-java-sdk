// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListDDoSInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDDoSInstancesResponseBody body;

    public static ListDDoSInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDDoSInstancesResponse self = new ListDDoSInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListDDoSInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDDoSInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDDoSInstancesResponse setBody(ListDDoSInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDDoSInstancesResponseBody getBody() {
        return this.body;
    }

}
