// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductInstancesResponseBody body;

    public static ListProductInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductInstancesResponse self = new ListProductInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListProductInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductInstancesResponse setBody(ListProductInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductInstancesResponseBody getBody() {
        return this.body;
    }

}
