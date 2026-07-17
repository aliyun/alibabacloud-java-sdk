// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListBotInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBotInstancesResponseBody body;

    public static ListBotInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBotInstancesResponse self = new ListBotInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListBotInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBotInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBotInstancesResponse setBody(ListBotInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBotInstancesResponseBody getBody() {
        return this.body;
    }

}
