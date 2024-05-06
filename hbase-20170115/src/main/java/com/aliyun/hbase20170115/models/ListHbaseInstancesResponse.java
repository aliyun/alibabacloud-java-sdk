// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ListHbaseInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHbaseInstancesResponseBody body;

    public static ListHbaseInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHbaseInstancesResponse self = new ListHbaseInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListHbaseInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHbaseInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHbaseInstancesResponse setBody(ListHbaseInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHbaseInstancesResponseBody getBody() {
        return this.body;
    }

}
