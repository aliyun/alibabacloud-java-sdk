// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourceInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceInstancesResponseBody body;

    public static ListResourceInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceInstancesResponse self = new ListResourceInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceInstancesResponse setBody(ListResourceInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceInstancesResponseBody getBody() {
        return this.body;
    }

}
