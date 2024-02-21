// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListEcsInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEcsInstancesResponseBody body;

    public static ListEcsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEcsInstancesResponse self = new ListEcsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListEcsInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEcsInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEcsInstancesResponse setBody(ListEcsInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEcsInstancesResponseBody getBody() {
        return this.body;
    }

}
